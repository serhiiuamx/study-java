package com.custom.lambda;

public class CustClass<T> {
    private T val;

    CustClass(T val) {
        this.val = val;
    }

    CustClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
