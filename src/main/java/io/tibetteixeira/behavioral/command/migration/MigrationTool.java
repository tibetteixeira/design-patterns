package io.tibetteixeira.behavioral.command.migration;

import io.tibetteixeira.behavioral.command.migration.command.MigrationCommand;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class MigrationTool {

    private List<MigrationCommand> migrations = new ArrayList<>();
    private int nextMigrationIndex = 0;

    public void addMigration(MigrationCommand migration) {
        migrations.add(migration);
    }

    public void up() {
        if(migrations.size() > nextMigrationIndex) {
            migrations.get(nextMigrationIndex).execute();
            nextMigrationIndex++;
        } else {
            System.out.println("You are up to date!");
        }
    }

    public void down() {
        if(nextMigrationIndex > 0) {
            migrations.get(nextMigrationIndex - 1).undo();
            nextMigrationIndex--;
        } else {
            System.out.println("You don't have migrations left");
        }
    }

    public void latest() {
        while(nextMigrationIndex < migrations.size()) up();
    }

    public void rollback() {
        while(nextMigrationIndex != 0) down();
    }
}
