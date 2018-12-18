package org.amrit.oopsfeature;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * Definition:
 * Our internal data should not go out directly that is outside person can't access our internal data directly .
 * By using private access specifier we can implement data hiding concept.
 * The main advantage of data hiding is security.
 * Note:
 * Recommended modifier for data member/variable is PRIVATE.
 */
public class DataHiding {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
