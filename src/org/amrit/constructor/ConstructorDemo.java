package org.amrit.constructor;

/**
 * Created by Amrit - Ojha on 12/15/2018.
 */

/**
 * Rules to create Constructor
 * 1. constructor name is same as class name.
 * 2. constructor doesn't have any return type not even void.
 * 3. constructor are not inherited.
 * 4. constructor can be private i.e. (We can make the constructor private to prevent the outside world for creating a newInstance
 * of our class.
 * 5. constructor calls the default constructor of it's super class/parent class. i.e.(The java compiler automatically insert
 * a call to super() at the first line of the constructor.
 * 6. The first statement in constructor must call to this() or super(). i.e.(The first statement of every constructor must be a
 * call to either this() (an overloaded constructor) or super().
 */

public class ConstructorDemo {

    private int id;
    private String firstName, lastName;

    public ConstructorDemo() {
        System.out.println("default constructor");
    }

    public ConstructorDemo(int a) {
        System.out.println("1-args constructor");
    }

    public ConstructorDemo(int id, String firstName, String lastName) {
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void display() {
        System.out.println("Id : " + id + " FirstName : " + firstName + " LastName : " + lastName);
    }

    public static void main(String[] args) {

        ConstructorDemo cd = new ConstructorDemo(); //Named Object.
        new ConstructorDemo(10); //NameLess Object.
        new ConstructorDemo(1, "Amrit", "Ojha").display();
    }
}
