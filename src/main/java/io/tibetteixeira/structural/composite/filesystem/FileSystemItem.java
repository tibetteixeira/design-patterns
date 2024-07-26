package io.tibetteixeira.structural.composite.filesystem;

public interface FileSystemItem {

    void print(String structure);
    void add(FileSystemItem item);
}
