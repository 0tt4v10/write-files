/*
 * Author: 0tt4v10
 * Description: Start of the Application
 * Created: 2026-11-21
 * Copyright (c) 2026 0tt4v10
 * License: MIT
 */

package io.github._0tt4v10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import io.github._0tt4v10.domain.FileRepository;
import io.github._0tt4v10.domain.FileContentRead;
import io.github._0tt4v10.domain.FileContentWriter;
import java.util.List;

public class WriteFilesApplication {
    public static void main(String[] args) throws IOException {

        // Create new Array List for all files
        List<FileRepository> files = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Ask if the data folder should be deleted
        File dataFolder = new File("data");

        if (dataFolder.exists()) {
            System.out.print("Delete folder data? (y/n): ");
            String answer = sc.nextLine().trim();

            if (answer.equalsIgnoreCase("y")) {
                File[] content = dataFolder.listFiles();

                if (content != null) {
                    for (File f : content) {
                        f.delete();
                    }
                }

                dataFolder.delete();
                System.out.println("Folder data deleted.");
            }
        }

        // Create folder data if it does not exist
        new File("data").mkdirs();

        // Ask for user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Create new File name: ");
            String input = sc.nextLine().trim();

            // Ask again if the name is empty
            while (input.isEmpty()) {
                System.out.print("Name must not be empty, try again: ");
                input = sc.nextLine().trim();
            }

            // Remove ".txt" because the constructor adds it
            if (input.endsWith(".txt")) {
                input = input.substring(0, input.length() - 4);
            }

            files.add(new FileRepository(i + 1, input));
        }

        // for each file in files create the file in folder data
        for (FileRepository file : files) {
            try {
                file.createFile("data");
            } catch (IOException e) {
                System.out.println("Could not create file: " + e.getMessage());
            }
        }

        // Write content in every file
        FileContentWriter fw = new FileContentWriter();
        for (FileRepository file : files) {
            fw.fileWrite("Hello", file.getName(), "data");
        }

        // Read content of every file
        FileContentRead fcr = new FileContentRead();
        for (FileRepository file : files) {
            fcr.FileRead(file.getName(), "data");
        }

        sc.close();
    }
}