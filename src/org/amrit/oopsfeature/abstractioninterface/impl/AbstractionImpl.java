package org.amrit.oopsfeature.abstractioninterface.impl;

import org.amrit.oopsfeature.abstractioninterface.Abstraction;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */
public class AbstractionImpl implements Abstraction {
    @Override
    public boolean insert() {
        /**
         * Write business logic to insert record.
         */
        return true;
    }

    @Override
    public boolean delete() {
        /**
         * Write business logic to delete record.
         */
        return true;
    }
}
