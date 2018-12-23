package org.amrit.controlflow.ifelse;

/**
 * Created by Amrit - Ojha on 12/22/2018.
 */

import java.util.Scanner;

/**
 * The arguments to the if statements should be boolean by mistake if we are providing any other type we will get "CompileTimeError".
 */
public class IfElseDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. getAll Student");
            System.out.println("4. getById");
            System.out.println("5. Search");
            System.out.println("6. Export");
            System.out.println("7. Import");
            System.out.println("8. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inserted");
                    break;
                case 2:

                    System.out.println("Deleted");
                    break;
                case 3:

                    System.out.println("GetAll");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.printf("Wrong Input");
            }
        }
    }
}

