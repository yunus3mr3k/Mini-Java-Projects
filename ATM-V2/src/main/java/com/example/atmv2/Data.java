package com.example.atmv2;


import java.util.ArrayList;


public class Data {

    ArrayList<Account> accounts = new ArrayList<>();

    public Data() {
        accounts.add(new Account(2004, 12345, 2000, "emre", "Karaman", "emre@gmail.com", "555"));
        accounts.add(new Account(1999, 12345, 2500, "fatih", "Karaman", "fatih@gmail.com", "555"));
        accounts.add(new Account(2005, 12345, 1900, "samet", "Karaman", "samet@gmail.com", "555"));
        accounts.add(new Account(2008, 12345, 1500, "kadir", "Karaman", "kadir@gmail.com", "555"));
        accounts.add(new Account(2011, 12345, 1400, "efe", "Karaman", "efe@gmail.com", "555"));
    }


}
