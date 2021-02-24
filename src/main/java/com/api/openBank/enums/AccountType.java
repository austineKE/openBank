package com.api.openBank.enums;

public enum AccountType {
    OKOA(1000),HEKIMA(10001), FULIZA(1002);
    private int value;

    private AccountType(int value) {
        this.value = value;
    }
    public int getAccountType() {
        return value;
    }
}
