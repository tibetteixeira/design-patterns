package io.tibetteixeira.behavioral.command.migration.command;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public abstract class MigrationCommand {

    protected Map<String, List<String>> database;

    public abstract void execute();
    public abstract void undo();
}
