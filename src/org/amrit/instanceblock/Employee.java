package org.amrit.instanceblock;

/**
 * Created by Amrit - Ojha on 12/15/2018.
 */

/**
 * By default Instance Variable DATA-TYPE value is given below.
 * int dataType value is "0"
 * String dataType value is "null".
 * Float dataType value is "0.0".
 * double dataType value is "0.0".
 */
public class Employee {
    int empId;
    String eName;
    float eSalary;

    public Employee(){
        System.out.println("default");
    }

    /**
     * Instance block is used to initialize instance variable during object creation.
     */ {
        empId = 1;
        eName = "Amrit";
        eSalary = 10000;
    }

    public void display() {
        System.out.println("Id is : " + empId + " Name is : " + eName + " Salary is: " + eSalary);
    }

    public static void main(String[] args) {
        new Employee().display();
    }

}
