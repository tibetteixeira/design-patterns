package io.tibetteixeira.structural.bridge.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Employee {

    protected String name;
    protected Integer age;
    protected Double salary;
}
