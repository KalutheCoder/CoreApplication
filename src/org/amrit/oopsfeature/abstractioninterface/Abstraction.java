package org.amrit.oopsfeature.abstractioninterface;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * Hide internal implementation and just highlight the set of service, is called ABSTRACTION.
 * By using abstract classes and interfaces we can implement abstraction
 * EXAMPLE:
 * By using ATM GUI screen bank people are highlighting the set of services what they are offering without highlighting internal implementation.
 * ADVANTAGE:
 * 1. We can achieve security as we are not highlighting our internal implementation. i.e. ( outside person doesn't aware our internal
 * implementation ).
 * 2. Enhancement will become very easy because without effecting end user we can able to perform any type of changes in our internal system.
 * 3. It improves maintainability of the application.
 * 4. It improves easy to use our system.
 */
public interface Abstraction {

    boolean insert();

    boolean delete();
}
