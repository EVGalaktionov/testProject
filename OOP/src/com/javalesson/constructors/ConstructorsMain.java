package com.javalesson.constructors;

import com.javalesson.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
     /*   Employee employee1 = new Employee("Evgeniy Galaktionov", "Programmer", 100000);
        Employee employee2 = new Employee("Julia Bykovskaya", "HR-Manager", 60000);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());*/
    }
}
