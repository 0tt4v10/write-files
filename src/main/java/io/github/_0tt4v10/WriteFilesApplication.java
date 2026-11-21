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
import io.github._0tt4v10.domain.FileContentRead;
import io.github._0tt4v10.domain.FileContentWriter;

public class WriteFilesApplication 
{
    public static void main( String[] args ) throws IOException {
        // Create new File named "Buch"
        FileRepository file = new FileRepository(1, "Buch");
        FileRepository file2 = new FileRepository(2, "Book");
        file.createFile("data");
        file2.createFile("data");
        
        // Write Content in "Buch.txt"
        FileContentWriter fw = new FileContentWriter();
        fw.fileWrite("Hello", "Buch", "data");
        System.out.println(file.toString());

        // Read Content in "Buch.txt"
        FileContentRead fcr = new FileContentRead();
        fcr.FileRead("Buch", "data");
    }
}
