/*
 * Group2:       
 *      Willaim Benefield <wbb31@uab.edu>
 *      Clayton Dalton <cgdalton@uab.edu>
 *      Luis Figueroa <alefigue@uab.edu>
 *      Zachary Harper <zharper@uab.edu>
 *      Daniel Pineda <mdpineda@uab.edu>
 *      Joe Wong <jawong1@uab.edu>
 *
 * Assignment:  Retirement Planner - EE333 Spring 2022
 */
package edu.uab.ee333.retirementplanner;

// Imports
import java.util.Scanner;

/** @author zharper42 */
public class Planner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // header
        String star = "*";
        String blank = " ";
        System.out.println( star.repeat(69) );
        System.out.print( blank.repeat(26) );
        System.out.println("Retirement Planner");
        System.out.println( star.repeat(69) );
        
        // new scanner and account objects
        Scanner input = new Scanner(System.in);
        Account myAcc = new Account();
        
        // user input
        System.out.println("Enter initial investment($):");
        myAcc.setBalance(input.nextDouble());
        System.out.println("Enter monthly investment($):");
        myAcc.setMonthly(input.nextDouble());
        System.out.println("Enter annual percentage rate(%): ");
        myAcc.setAPR(input.nextDouble());
        System.out.println("Enter how many years: ");
        myAcc.setYears(input.nextInt());
        
        myAcc.compound();
        
        // chart
        System.out.println( star.repeat(69) );
        System.out.println("|  Total   |           |          |           | Inflated | Inflated |");
        System.out.println("| Invested |  Balance  | Dividend | Inflation | Balance  | Dividend |");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-11s", " $" + myAcc.getTotalInvested());
        System.out.printf("%-12s", " $" + myAcc.getBalance());
        System.out.printf("%-11s", " $" + myAcc.getDividend());
        System.out.printf("%-12s", " " + myAcc.getInflation() + "%");
        System.out.printf("%-11s", " $" + myAcc.getInfBalance());
        System.out.printf("%-11s", " $" + myAcc.getInfDividend());
        System.out.printf("\n\n");
    }
    
}
