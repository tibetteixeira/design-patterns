package io.tibetteixeira.structural.bridge.converter;

import io.tibetteixeira.structural.bridge.employee.Employee;

import java.util.Locale;

import static java.lang.String.format;

public class CsvConverter implements Converter {

    @Override
    public String getEmployeeFormated(Employee employee) {
        return format(Locale.US, "\"%s\";%d;%.2f", employee.getName(), employee.getAge(), employee.getSalary());
    }
}
