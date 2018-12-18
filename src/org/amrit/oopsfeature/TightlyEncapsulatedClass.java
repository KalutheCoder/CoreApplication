package org.amrit.oopsfeature;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * A class is said to be tightly encapsulated if and only if every variable of that class declared as "private" whether the variable has
 * getter and setter methods or not, and whether these methods declared declared as public or not, these things checking are not
 * required to perform.
 * <p>
 * Note:
 * IF the parent class is not tightly encapsulated then no child class is tightly encapsulated.
 */
public class TightlyEncapsulatedClass {

    private double balance;

    public double getBalance() {
        return balance;
    }

    /**
     * Which of the following classes are tightly encapsulated.
     */
    class A {
        private int x = 10; // (valid)
    }

    class B extends A {
        int y = 20; // (invalid)
    }

    class C extends A {
        private int z = 30; // (valid)
    }

    /**
     * Which of the classes are tightly encapsulated.
     */
    class A1 {
        int x = 10; // (not)
    }

    class B1 extends A1 {
        private int y = 20; // (not)
    }

    class C1 extends A1 {
        private int z = 30; // (not)
    }

    /**
     * Note: If the parent class is not tightly encapsulated then no child class is tightly encapsulated.
     */
}
