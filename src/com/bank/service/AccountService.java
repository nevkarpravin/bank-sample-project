package com.bank.service;

import com.bank.model.Account;

import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class AccountService {
    static int counter;
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    public Account createAccount(){
        Account account = new Account();
        System.out.println("Enter Account Name");
        String name = scanner.next();
        account.setName(name);
        System.out.println("Enter opening Balance");
        double balance = scanner.nextDouble();
        account.setBalance(balance);
        System.out.println("Enter Address");
        String address = scanner.next();
        account.setAddress(address);
        account.setId("SAV" + ++counter);
        accounts.add(account);
        return account;
    }

    public Account getAccount() {
        System.out.println("Enter Id");
        String id = scanner.next();
        Account account = getAccountForId(id);
        return null;
    }

    private Account getAccountForId(String id) {
        for (Account account: accounts){
            if(account.getId().equalsIgnoreCase(id))
                return account;
        }
        return null;
    }

    public Account depositBalance(){
        System.out.println("Enter Id");
        String accountId = scanner.next();
        System.out.println("Enter Deposit Balance ");
        double depositAmount = scanner.nextDouble();
        Account account = getAccountForId(accountId);
        double newBalance = account.getBalance() + depositAmount;
        account.setBalance(newBalance);
        return account;
    }
}
