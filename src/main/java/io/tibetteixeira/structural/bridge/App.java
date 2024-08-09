package io.tibetteixeira.structural.bridge;

import io.tibetteixeira.structural.bridge.converter.Converter;
import io.tibetteixeira.structural.bridge.converter.CsvConverter;
import io.tibetteixeira.structural.bridge.converter.JsonConverter;
import io.tibetteixeira.structural.bridge.employee.Developer;
import io.tibetteixeira.structural.bridge.employee.Employee;
import io.tibetteixeira.structural.bridge.employee.ProjectManager;

public class App {

    public static void main(String[] args) {
        Converter csvConverter = new CsvConverter();
        Converter jsonConverter = new JsonConverter();

        Employee dev = new Developer("Gil", 25, 1290.90);
        Employee manager = new ProjectManager("Gal", 43, 2290.90);

        System.out.println("---- CSV ----");
        System.out.println(csvConverter.getEmployeeFormated(dev));
        System.out.println(csvConverter.getEmployeeFormated(manager));
        System.out.println("");
        System.out.println("---- JSON ----");
        System.out.println(jsonConverter.getEmployeeFormated(dev));
        System.out.println(jsonConverter.getEmployeeFormated(manager));
    }
}
