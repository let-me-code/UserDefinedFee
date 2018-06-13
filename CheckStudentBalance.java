package com.hackercode.utilities;

import com.hackercode.UserDefinedExceptions.FeePaymentException;

public class CheckStudentBalance {

    private int roll;
    private double balance;
    public CheckStudentBalance(int roll){
        this.roll=roll;
    }
    public void payBal(double amount) {
        balance=amount;
    }
    public void feePaymentCheck(double amount)throws FeePaymentException{
        balance-=amount;
        if(balance>=1000){
            throw new FeePaymentException(balance);
        }
    }
    public double getBalance() {
        return balance;
    }

    public int getRoll() {
        return roll;
    }
}
