package io.tibetteixeira.structural.composite;

import io.tibetteixeira.structural.composite.filesystem.File;
import io.tibetteixeira.structural.composite.filesystem.FileSystemItem;
import io.tibetteixeira.structural.composite.filesystem.Folder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        fileSystemItem();
        projectFileSystem();
    }

    private static void projectFileSystem() {
        String dir = System.getProperty("user.dir");
        FileSystemItem fromDisk = createCompositeFromFile(new java.io.File(dir));
        fromDisk.print("");
    }

    private static FileSystemItem createCompositeFromFile(java.io.File file) {
        if (!file.isDirectory()) {
            return new File(file.getName());
        }

        List<FileSystemItem> children = new ArrayList<>();
        java.io.File[] files = file.listFiles();
        Arrays.stream(files)
                .forEach(child -> children.add(createCompositeFromFile(child)));

        return new Folder(file.getName(), children);
    }

    private static void fileSystemItem() {
        Folder rootFolder = new Folder("Root Folder");

        FileSystemItem folder1 = new Folder("Folder 1");
        FileSystemItem folder2 = new Folder("Folder 2");
        FileSystemItem folder3 = new Folder("Folder 3");

        FileSystemItem folder31 = new Folder("Folder 3.1");

        FileSystemItem file11 = new File("File 1.1");
        FileSystemItem file12 = new File("File 1.2");

        FileSystemItem file21 = new File("File 2.1");

        FileSystemItem file31 = new File("File 3.1");

        FileSystemItem file311 = new File("File 3.1.1");
        FileSystemItem file312 = new File("File 3.1.2");

        folder31.add(file311);
        folder31.add(file312);
        folder3.add(folder31);
        folder3.add(file31);

        folder2.add(file21);

        folder1.add(file11);
        folder1.add(file12);

        rootFolder.add(folder1);
        rootFolder.add(folder2);
        rootFolder.add(folder3);

        rootFolder.print("");
    }
}
