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

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** @author mdpineda */
public class AccountNGTest {

  private Account accountTest;

  public AccountNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {

    accountTest = new Account(1000, 100, 5, 30);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of setBalance method, of class Account. */
  @Test
  public void testSetBalance() {

    var balance = accountTest.balance;
    Account instance = accountTest;
    instance.setBalance(balance);
  }

  /** Test of setMonthly method, of class Account. */
  @Test
  public void testSetMonthly() {

    double monthly = 0.0;
    Account instance = accountTest;
    instance.setMonthly(monthly);
  }

  /** Test of setAPR method, of class Account. */
  @Test
  public void testSetAPR() {

    double percent = 0.0;
    Account instance = accountTest;
    instance.setAPR(percent);
  }

  /** Test of setYears method, of class Account. */
  @Test
  public void testSetYears() {

    int years = 0;
    Account instance = accountTest;
    instance.setYears(years);
  }

  /** Test of compound method, of class Account. */
  @Test
  public void testCompound() {

    Account instance = accountTest;
    instance.compound();
  }

  /** Test of getTotalInvested method, of class Account. */
  @Test
  public void testGetTotalInvested() {

    Account instance = accountTest;
    instance.compound();
    String expResult = "37000.00";
    String result = instance.getTotalInvested();
    assertEquals(result, expResult);
  }

  /** Test of getBalance method, of class Account. */
  @Test
  public void testGetBalance() {

    Account instance = accountTest;
    instance.compound();
    String expResult = "86241.16";
    String result = instance.getBalance();
    assertEquals(result, expResult);
  }

  /** Test of getDividend method, of class Account. */
  @Test
  public void testGetDividend() {

    Account instance = accountTest;
    instance.compound();
    String expResult = "2587.23";
    String result = instance.getDividend();
    assertEquals(result, expResult);
  }

  /** Test of getInflation method, of class Account. */
  @Test
  public void testGetInflation() {

    Account instance = accountTest;
    instance.compound();
    String expResult = "60.00";
    String result = instance.getInflation();
    assertEquals(result, expResult);
  }

  /** Test of getInfBalance method, of class Account. */
  @Test
  public void testGetInfBalance() {

    Account instance = accountTest;
    instance.compound();
    String expResult = "34496.46";
    String result = instance.getInfBalance();
    assertEquals(result, expResult);
  }

  /** Test of getInfDividend method, of class Account. */
  @Test
  public void testGetInfDividend() {

    Account instance = accountTest;
    instance.compound();
    String expResult = "1034.89";
    String result = instance.getInfDividend();
    assertEquals(result, expResult);
  }
}