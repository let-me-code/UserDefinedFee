package com.hackercode.UserDefinedExceptions;

public class FeePaymentException extends Exception {

    private double fee;
    public FeePaymentException(double fee){
        this.fee=fee;
    }
    public double getFee() {
        return fee;
    }
}
