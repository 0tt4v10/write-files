package io.github._0tt4v10.domain;

public class FileRepository {
    private final int id;
    private final String name;
    private String path;

    public FileRepository(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
