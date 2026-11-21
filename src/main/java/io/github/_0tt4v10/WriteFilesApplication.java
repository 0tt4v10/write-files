package io.github._0tt4v10;

import java.io.IOException;

import io.github._0tt4v10.domain.FileRepository;

public class WriteFilesApplication 
{
    public static void main( String[] args ) throws IOException {
        FileRepository file = new FileRepository(1, "Buch");
        file.createFile("data");
        System.out.println(file.toString());
    }
}
