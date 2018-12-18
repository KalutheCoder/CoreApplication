package org.amrit.instanceblock;

/**
 * Created by Amrit - Ojha on 12/15/2018.
 */

/**
 * Instance block are used to initialize instance variable.
 * Instance block are used to write business logic while object is creating/initializing.
 * Instance block are invoked during object creation.
 * Both CONSTRUCTOR and INSTANCE-BLOCK are used for same purpose but first INSTANCE-BLOCK are executed then constructor will called.
 * Constructor logic are specific to particular object.
 * Instance block logic are common for all object.
 * It is possible to declare multiple instance block in class.
 * Instance VARIABLE, BLOCK, METHOD memory is allocated during object creation.
 */
public class InstanceBlock {

    public InstanceBlock() {
        this(10); //Calling 1-args constructor.
        System.out.println("default constructor");
    }

    public InstanceBlock(int a) {
        System.out.println("1-args constructor");
    }

    public InstanceBlock(int a, int b) {
        System.out.println("2-args constructor");
    }

    {
        System.out.println("instance block");
    }

    {
        System.out.println("instance block 2");
    }


    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock(10);
        new InstanceBlock(10, 20);

    }
}


