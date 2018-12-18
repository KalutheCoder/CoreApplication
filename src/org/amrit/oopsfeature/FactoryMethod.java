package org.amrit.oopsfeature;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

import java.text.DateFormat;

/**
 * By using class name if we are calling a method and that method returns the same class object such type of method is called factory method.
 */
public class FactoryMethod {

    Runtime runtime = Runtime.getRuntime(); // here, getRuntime() is a factory method.
    DateFormat dateFormat = DateFormat.getInstance(); // here, getInstance is a factory method.

    /**
     * If object creation required under some constraints then we can implement by using factory method.
     */
}
