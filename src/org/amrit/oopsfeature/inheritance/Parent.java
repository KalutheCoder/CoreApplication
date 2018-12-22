package org.amrit.oopsfeature.inheritance;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * IS-A Relationship also known as Inheritance.
 * By using extends keyword we can implement IS-A relationship.
 * The main advantage of IS-A relationship is reusability.
 * <p>
 * CONCLUSION:
 * 1. Whatever the parent has by default available to the child but whatever the child has by default not available to the parent.
 * Hence, on the child reference we can call both parent and child class method. But, on the parent reference we can call only methods
 * available in the parent class and we can't call child specific methods.
 * <p>
 * 2. parent class reference can be used used to hold child class object but by using that reference we can call only methods available
 * in parent class and child specific methods we can't call.
 * <p>
 * 3. Child class reference cannot be used to hold parent class object.
 */
public class Parent {

    public void methodOne() {

    }

    class Child extends Parent {

        public void methodTwo() {

        }
    }

    public static void main(String[] args) {


    }
}
