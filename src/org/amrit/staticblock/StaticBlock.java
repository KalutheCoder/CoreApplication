package org.amrit.staticblock;

/**
 * Created by Amrit - Ojha on 12/15/2018.
 */

/**
 * static block used to write logic those logic are executed during .class file loading.
 * class is loading only once so,static block are executed only once during .class file loading
 * static block are used to initialize static variable.
 */
public class StaticBlock {

    static {
        System.out.println("static block-1");
    }

    static {
        System.out.println("static block-2");
    }

    {
        System.out.println("instance block-1");
    }

    {
        System.out.println("instance block-2");
    }


    public StaticBlock() {
        System.out.println("0-args constructor");
    }

    public StaticBlock(int a) {
        System.out.println("1-args constructor");
    }

    public static void main(String[] args) {

        new StaticBlock();
        new StaticBlock(10);
    }
}
