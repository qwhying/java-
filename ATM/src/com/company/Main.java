package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ATM[] accounts = new ATM[10];
        for (int i = 0; i < 10; i++)
            accounts[i] = new ATM(i, 100);
        while (true) {
            System.out.println("Enter an id:");
            Scanner input = new Scanner(System.in);
            int id = input.nextInt();
            while (true) {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4 exit");
                System.out.print("Enter a choice:");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].checkBalance());
                        continue;
                    case 2:
                        System.out.print("Enter an amount to withdraw:");
                        double amount1 = input.nextDouble();
                        accounts[id].withdraw(amount1);
                        continue;
                    case 3:
                        System.out.print("Enter an amount to deposit:");
                        double amount2 = input.nextDouble();
                        accounts[id].deposit(amount2);
                        continue;
                    case 4:
                        break;
                }
                break;
            }

        }
    }
}
