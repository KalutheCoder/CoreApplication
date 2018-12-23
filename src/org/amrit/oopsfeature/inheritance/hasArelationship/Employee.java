package org.amrit.oopsfeature.inheritance.hasArelationship;

/**
 * Created by Amrit - Ojha on 12/21/2018.
 */
public class Employee {

    int age;
    Name name;

    public void display(int age, Name name) {
        System.out.println("Age : " + age);
        System.out.println("FullName : " + name.firstName + " -" + name.middleName + "-" + name.lastName);
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        Name name = new Name("Amrit", "Kumar", "Ojha");
        employee.display(25, name);
    }
}
