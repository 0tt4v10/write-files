/*
 * Author: 0tt4v10
 * Description: writes text line by line
 * Created: 2026-11-21
 * Copyright (c) 2026 0tt4v10
 * License: MIT
 */

package io.github._0tt4v10.domain;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileContentWriter {


    public void fileWrite(String content, String name, String folder) {
        File file = new File(folder, name + ".txt");

        if (!file.exists()) {
            System.out.println("File not found: " + file.getPath());
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(content + "\n");
            System.out.println("File has been written.");
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
