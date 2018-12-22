package org.amrit.oopsfeature.inheritance.multiple;

/**
 * Created by Amrit - Ojha on 12/22/2018.
 */
public class Student {

    int m1, m2;

    public void getMarks(int m1, int m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public void putMarks() {
        System.out.println("First : " + m1);
        System.out.println("Second : " + m2);
    }
}
