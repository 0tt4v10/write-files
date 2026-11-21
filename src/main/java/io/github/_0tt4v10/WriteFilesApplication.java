/*
 * Author: 0tt4v10
 * Description: Start of the Application
 * Created: 2026-11-21
 * Copyright (c) 2026 0tt4v10
 * License: MIT
 */

package io.github._0tt4v10;

import java.io.IOException;

import io.github._0tt4v10.domain.FileRepository;
import io.github._0tt4v10.domain.FileContentWriter;

public class WriteFilesApplication 
{
    public static void main( String[] args ) throws IOException {
        FileRepository file = new FileRepository(1, "Buch");
        file.createFile("data");

        FileContentWriter fw = new FileContentWriter();
        fw.fileWrite("Hello", "Buch.txt", "data");
        System.out.println(file.toString());
    }
}
