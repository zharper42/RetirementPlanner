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
package edu.uab.zharper.retirementplannergui;

/** A static class that all controllers have access to for pulling information. 
 *
 *  @author: Joe Wong <jawong1@uab.edu>
 */
public class StaticTemp {

  public static boolean whichPage;
    
  private static String balance;
  private static String totalInvested;
  private static String dividend;
  private static String infBalance;
  private static String infDividend;

  /** @return the balance */
  public static String getBalance() {
    return balance;
  }

  /** @param aBalance the balance to set */
  public static void setBalance(String aBalance) {
    balance = aBalance;
  }

  /** @return the total */
  public static String getDirectlyInvested() {
    return totalInvested;
  }

  /** @param aTotal the total to set */
  public static void setDirectlyInvested(String aTotalInvested) {
    totalInvested = aTotalInvested;
  }

  /** @return the dividend */
  public static String getDividend() {
    return dividend;
  }

  /** @param aDividend the dividend to set */
  public static void setDividend(String aDividend) {
    dividend = aDividend;
  }

  /** @return the infBalance */
  public static String getInfBalance() {
    return infBalance;
  }

  /** @param aInfBalance the infBalance to set */
  public static void setInfBalance(String aInfBalance) {
    infBalance = aInfBalance;
  }

  /** @return the infDividend */
  public static String getInfDividend() {
    return infDividend;
  }

  /** @param aInfDividend the infDividend to set */
  public static void setInfDividend(String aInfDividend) {
    infDividend = aInfDividend;
  }
  
  /** @param which the which to set */
  public static void setWhichPage(boolean which) {
    whichPage = which;
  }
  
  /** @return the whichPage */
  public static boolean getWhichPage() {
    return whichPage;
  }
}
