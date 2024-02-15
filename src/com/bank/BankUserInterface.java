package com.bank;

import java.util.Scanner;

public class BankUserInterface {

    public int displayMainChoice(){
        System.out.println("Enter choice\n" +
                "1. Create Account   \n" +
                "2. Get Account Details\n" +
                "3. Check Balance  \n" +
                "4. Deposit Balance\n" +
                "5. Withdraw Balance \n" +
                "6. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
