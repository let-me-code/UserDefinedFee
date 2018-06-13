package com.hackercode.controller;

import com.hackercode.UserDefinedExceptions.FeePaymentException;
import com.hackercode.utilities.CheckStudentBalance;

import java.util.Scanner;

public class IssueAdmitCard {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id no.:");
        CheckStudentBalance c = new CheckStudentBalance(sc.nextInt());
        System.out.println("Enter balance of student:");
        c.payBal(sc.nextDouble());
        sc.close();
        try{
            System.out.println("Depositing Fee");
            c.feePaymentCheck(94250.00);
            System.out.println("Admit card issued!");

        } catch(FeePaymentException e){
            System.out.println("Admit card not issued!\nBalance left : Rs."+e.getFee());
        }
    }
}
