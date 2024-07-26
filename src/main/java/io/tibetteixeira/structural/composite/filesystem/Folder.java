package io.tibetteixeira.structural.composite.filesystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Folder implements FileSystemItem {

    private String description;
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String description) {
        this.description = description;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + description);
        items.forEach(item -> item.print(structure + "| \t"));
    }

    @Override
    public void add(FileSystemItem item) {
        items.add(item);
    }
}
