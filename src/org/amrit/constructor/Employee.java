package org.amrit.constructor;

/**
 * Created by Amrit - Ojha on 12/15/2018.
 */
public class Employee {

    private int eId;
    private String eName;
    private double eSalary;


    public Employee(int eId, String eName, double eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public void display() {
        System.out.println(eId + eName + eSalary);
    }

    public static void main(String[] args) {

        new Employee(1, "Amrit", 70000).display();
    }

}
