package io.tibetteixeira.structural.composite.filesystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class File implements FileSystemItem {

    private String description;

    @Override
    public void print(String structure) {
        System.out.println(structure + description);
    }

    @Override
    public void add(FileSystemItem item) {
        throw new RuntimeException("Cannot add filesystem item in File type");
    }
}
