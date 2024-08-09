package io.tibetteixeira.structural.bridge.converter;

import io.tibetteixeira.structural.bridge.employee.Employee;

import java.util.Locale;

import static java.lang.String.format;

public class JsonConverter implements Converter {

    @Override
    public String getEmployeeFormated(Employee employee) {
        String message = """
                {
                    "name":"%s",
                    "age":%d,
                    "salary":%.2f
                }
                """;
        return format(Locale.US, message, employee.getName(), employee.getAge(), employee.getSalary());
    }
}
