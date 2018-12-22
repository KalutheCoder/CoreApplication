package org.amrit.oopsfeature.inheritance.multiple;

/**
 * Created by Amrit - Ojha on 12/22/2018.
 */
public class Result extends Student implements Sport {

    @Override
    public void spMarks() {
        System.out.println("spmarks : " + sp);
    }

    public void display() {
        putMarks();
        spMarks();
        int total = m1 + m2 + sp;
        System.out.println("Total : " + total);
    }

    public static void main(String[] args) {

        Result result = new Result();
        result.getMarks(50, 50);
        result.display();
    }
}
