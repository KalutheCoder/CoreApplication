package org.amrit.oopsfeature;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * Binding of data and corresponding method into a single unit is called Encapsulation.
 * If any java class follows data hiding and abstraction such type of class is said to be encapsulated class.
 * Encapsulation = data hiding + abstraction.
 * <p>
 * ADVANTAGE:
 * 1. We can achieve security.
 * 2. It improves maintainability and modularity of the application.
 * 3. Enhancement will become very easy.
 * <p>
 * DISADVANTAGE:
 * 1. The main disadvantage of encapsulation is it increases length of the code and slows down execution.
 * 2. Every data member should be declared as "private" and for every member we have to maintain getter and setter methods.
 */
public class Encapsulation {

    private double balance;

    public double getBalance() {
        /**
         * Validate User
         */
        return balance;
    }

    public void setBalance(double balance) {
        /**
         * Validate User
         */
        this.balance = balance;
    }

    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Encapsulation e = new Encapsulation();
        e.setRollno(1);
        e.setName("amrit");
        System.out.println(e.getRollno());
        System.out.println(e.getName());
    }
}
