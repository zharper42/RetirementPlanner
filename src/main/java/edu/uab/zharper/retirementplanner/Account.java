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
package edu.uab.zharper.retirementplanner;

/** @author zharper42 */
public class Account {

  // Variables
  int years;
  double monthly, totalInvested;
  double balance, dividend;
  double infBalance, infDividend;
  double yrate, mrate;
  double monthYield, yearTotal = 0;
  double inflation = .02;

  /**
   * Create an Investment Account
   *
   * @param balance
   * @param monthly
   * @param percent
   * @param years
   */
  public Account(double balance, double monthly, double percent, int years) {
    this.balance = balance;
    totalInvested += balance;
    this.monthly = monthly;
    yrate = percent * 0.01;
    mrate = yrate / 12;
    this.years = years;
  }
  
  /** default constructor */
  public Account(){
    this.balance = 0;
    totalInvested += balance;
    this.monthly = 0;
    yrate = 5 * 0.01;
    mrate = yrate / 12;
    this.years = 0;
  }

  /** 
   * set initial balance
   * 
   * @param balance
   */
  public void setBalance(double balance) {
    this.balance = balance;
    totalInvested += balance;
  }
  /** 
   * set monthly investment
   * 
   * @param monthly
   */
  public void setMonthly(double monthly) {
    this.monthly = monthly;
  }

  /** 
   * set annual percent return
   * 
   * @param percent
   */
  public void setAPR(double percent) {
    yrate = percent * 0.01;
  }

  /** 
   * set number of years for compounding
   * 
   * @param years
   */
  public void setYears(int years) {
    this.years = years;
  }

  /**compound using objects stored information*/
  public void compound() {
    
      for(int y = 1; !(y > years); y++){
          
          // resets every year (mini-balance for specific year)
          yearTotal = 0;
          
        for(int m = 1; m < 13; m++){
          
          // basically magic
          yearTotal += monthly;
          monthYield = yearTotal * mrate;
          yearTotal += monthYield;
        }
        
        totalInvested += (monthly *12);  // amount directly invested
        balance += (balance * yrate);    // Compound for entire balance
        balance += yearTotal;            // Compound for this specific year
        
      }
      inflation = inflation * years;
      dividend = balance * 0.03;
  }

  /** @return string representation of totalInvested */
  public String getTotalInvested() {
    return String.format("%.2f", totalInvested);
  }
  
  /** @return string representation of balance */
  public String getBalance() {
    return String.format("%.2f", balance);
  }

  /** @return string representation of dividend 
   *  
   *  dividend is 3% to be safe (4% is standard)
   */
  public String getDividend() {
    return String.format("%.2f", dividend);
  }
  
  /** @return string representation of inflation 
   *
   *  inflation is 2% average per year
   */
  public String getInflation() {
    return String.format("%.2f", inflation * 100);
  }
  
  /** @return string representation of infBalance */
  public String getInfBalance() {
    infBalance = balance - (balance * inflation);
    return String.format("%.2f", infBalance);
  }
  
  /** @return string representation of infDividend */
  public String getInfDividend() {
    infDividend = dividend - (dividend * inflation);
    return String.format("%.2f", infDividend);
  }
}

