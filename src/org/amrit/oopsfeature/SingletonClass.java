package org.amrit.oopsfeature;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * For any java class if we are allow to create only one object such type of class is said to be singleton class.
 * Example:
 * 1. Runtime class
 * 2. ActionServlet
 * 3. ServiceLocator
 * 4. BusinessDelegate
 * <p>
 * ADVANTAGE:
 * If the requirement is same then instead of creating a separate object for every person we will create only one object and we can
 * share that object for every required person we can achieve this by using Singleton classes. That is the main advantage of Singleton
 * classes are performance will be improved and memory utilization will be improved.
 * <p>
 * CREATION OF SINGLETON CLASS.
 * We can create our own singleton classes for this we have to use private constructor,static variable and factory method.
 */
public class SingletonClass {

    public static void main(String[] args) {

        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        Runtime r3 = Runtime.getRuntime();

        System.out.println(r1 == r2); // TRUE
        System.out.println(r1 == r3); // TRUE
    }
}
