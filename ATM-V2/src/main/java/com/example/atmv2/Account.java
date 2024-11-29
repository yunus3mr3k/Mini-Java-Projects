package com.example.atmv2;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private double customerBalance;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private String customerPhoneNumber;
    private int customerID;
    private int customerPassword;

    public Account(int customerID, int customerPassword, double customerBalance, String customerName, String customerSurname, String customerEmail, String customerPhoneNumber) {
        this.customerBalance = customerBalance;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerID = customerID;
        this.customerPassword = customerPassword;


    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(int customerPassword) {
        this.customerPassword = customerPassword;
    }


}
