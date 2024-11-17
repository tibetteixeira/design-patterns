package io.tibetteixeira.behavioral.command.migration;

import io.tibetteixeira.behavioral.command.migration.command.ProductTable;
import io.tibetteixeira.behavioral.command.migration.command.UserTable;
import io.tibetteixeira.behavioral.command.migration.command.UserTableRoleColumn;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String, List<String>> database = new LinkedHashMap<>();
        MigrationTool tool = new MigrationTool();
        tool.addMigration(new UserTable(database));
        tool.addMigration(new ProductTable(database));
        tool.addMigration(new UserTableRoleColumn(database));

        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.latest();
        System.out.println(database);

        tool.rollback();
        System.out.println(database);

    }
}
