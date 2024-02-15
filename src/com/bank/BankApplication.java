package com.bank;

import com.bank.model.Account;
import com.bank.service.AccountService;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;

public class BankApplication {

    public static void main(String[] args) {
        AccountService service = new AccountService();
        BankUserInterface userInterface = new BankUserInterface();
        boolean flag = true;
        while (flag) {
        int choice = userInterface.displayMainChoice();
            switch (choice) {
                case 1:
                    Account account = service.createAccount();
                    System.out.println("Account created Sucessfully");
                    System.out.println("Account Id is : " + account.getId());
                    break;
                case 2:
                    Account account1 = service.getAccount();
                    if(account1 == null){
                        System.out.println("provided Id is incorrect");
                    } else {
                        System.out.println("Account Details are: ");
                        System.out.println("Account Name " + account1.getName());
                        System.out.println("Account Balance " + account1.getBalance());
                    }
                case 4:
                    Account account2 = service.depositBalance();
                    System.out.println("Amount Deposited in Account " + account2.getId());
                    System.out.println("New Balance is " + account2.getBalance());
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect choice");
                    break;
            }
        }
    }
}
