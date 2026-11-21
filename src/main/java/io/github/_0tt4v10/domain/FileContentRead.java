/*
 * Author: 0tt4v10
 * Description: Reads text files line by line
 * Created: 2026-11-21
 * Copyright (c) 2026 0tt4v10
 * License: MIT
 */

package io.github._0tt4v10.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContentRead {

    public void FileRead(String name, String folder) {
        File file = new File(folder, name + ".txt");

        if (!file.exists()) {
            System.out.println("File not found: " + file.getPath());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
