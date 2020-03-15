package com.bridgelabz.banking_simulation;

import com.bridgelabz.utility.QueueOperations;
import java.util.Scanner;

//Banking cash counter class that performs the operation of withdrawal and deposit.
public class BankingCashCounter {
    public static void main(String[] args) {
        //Object for queue operation and scanner class has been created.
        QueueOperations<Integer> objQueue = new QueueOperations();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of users");

        //Enter the number of users that are to enter the queue and the balance of the bank.
        int person = scan.nextInt();
        int cash = 10000;

        //Enqueue the users in the queue.
        for (int index = 1; index <= person; index++) {
            objQueue.enqueue(index);
        }

        //Performing cash counter operation for each and every individual and after that dequeue.
        while (person != 0) {
            System.out.println("Cash present " + cash);
            int count = 0, choice = 0;

            //Getting the value of count on the basis of choice made.
            while (count == 0) {
                System.out.println("\nChoose: \nPress 1 for Withdrawal\nPress 2 for Deposits");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        count += 1;
                        break;
                    case 2:
                        count += 2;
                        break;
                    default:
                        System.out.println("Invalid Choice Made.");
                }
            }

            //Performing the operation of withdrawal on the basis of the value of count.
            if (count == 1) {
                int amount1 = 0;
                int countWithdrawal = 0;
                while (countWithdrawal == 0) {
                    System.out.println("Enter the amount to be Withdrawn:");
                    amount1 = scan.nextInt();
                    if (amount1 > cash)
                        System.out.println("Sorry, Unable to dispense cash.\n");
                    else
                        cash = cash - amount1;
                    countWithdrawal++;
                }
                objQueue.dequeue();

                //Performing the operation of depositing the cash on count value.
            } else if (count == 2) {
                int amount2 = 0;
                int countDeposit = 0;
                while (countDeposit == 0) {
                    System.out.println("Enter the Deposited amount:");
                    amount2 = scan.nextInt();
                    countDeposit++;
                    if (amount2 < 0)
                        System.out.println("Please enter a valid amount.\n");
                    else
                        cash = cash + amount2;
                }
                objQueue.dequeue();
            }
            person--;
        }
        System.out.println("Available Balance :" + cash);
    }
}
