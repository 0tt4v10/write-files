package io.github._0tt4v10.domain;

import java.io.File;
import java.io.IOException;

public class FileRepository {
    private final int id;
    private final String name;

    public FileRepository(int id, String name) {
        this.id = id;
        this.name = name + ".txt";
    }

    public void createFile(String folder) throws IOException {
        new File(folder, name).createNewFile();
    }

    @Override
    public String toString() {
        return "FileRepository{id=" + id + ", name=" + name + "}";
    }
}
