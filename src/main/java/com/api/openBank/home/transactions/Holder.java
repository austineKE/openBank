package com.api.openBank.home.transactions;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * this is the account holder object
 * holds holder account name.
 */
public class Holder {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
