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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;

/**
 * FXML Controller class
 *
 * @author Zachary Harper
 */
public class InputpageController implements Initializable {

  @FXML private TextField initialTextField;
  @FXML private TextField monthlyTextField;
  @FXML private TextField aprTextField;
  @FXML private TextField yearsTextField;

  @FXML private Label initialInvalid;
  @FXML private Label monthlyInvalid;
  @FXML private Label aprInvalid;
  @FXML private Label yearsInvalid;

  @FXML private TextField balanceTextField;
  @FXML private TextField totalTextField;
  @FXML private TextField dividendTextField;
  @FXML private TextField infBalanceTextField;
  @FXML private TextField infDividendTextField;

  /** Initializes the controller class. */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO

  }

  @FXML
  private void switchToAbout() throws IOException {
    App.setRoot("aboutForm");
    AudioClip note = new AudioClip(this.getClass().getResource("/click_sound.mp3").toString());
    note.play();
  }

  @FXML
  public boolean checkValue() {

    double doubleValue;
    int intValue;

    try {
      doubleValue = Double.parseDouble((initialTextField.getText()));
    } catch (NumberFormatException a) {
      initialInvalid.setText("Invalid Field");
    }

    try {
      doubleValue = Double.parseDouble((monthlyTextField.getText()));
    } catch (NumberFormatException b) {
      monthlyInvalid.setText("Invalid Field");
    }

    try {
      doubleValue = Double.parseDouble((aprTextField.getText()));
    } catch (NumberFormatException c) {
      aprInvalid.setText("Invalid Field");
    }

    try {
      intValue = Integer.parseInt((yearsTextField.getText()));
    } catch (NumberFormatException d) {
      yearsInvalid.setText("Invalid Field");
    }

    if ((initialInvalid.getText()).equals("Invalid Field")) return false;
    if ((monthlyInvalid.getText()).equals("Invalid Field")) return false;
    if ((aprInvalid.getText()).equals("Invalid Field")) return false;
    if ((yearsInvalid.getText()).equals("Invalid Field")) return false;

    return true;
  }

  @FXML
  public void CalculateClick() {

    initialInvalid.setText("");
    monthlyInvalid.setText("");
    aprInvalid.setText("");
    yearsInvalid.setText("");

    if (checkValue() == false) return;

    // Variables
    double balance = Double.valueOf(initialTextField.getText());
    double monthly = Double.valueOf(monthlyTextField.getText());
    double percent = Double.valueOf(aprTextField.getText());
    int years = Integer.valueOf(yearsTextField.getText());

    double totalInvested, dividend, yrate, mrate;
    double infBalance, infDividend;
    double inflation = 0.02;

    // Yearly/monthly return
    yrate = percent * 0.01;
    mrate = yrate / 12;
    totalInvested = balance;

    // Runs once per year
    for (int i = 1; !(i > years); i++) {

      balance = Compound(yrate, mrate, monthly, balance);
      totalInvested += (monthly * 12);
    }

    // Dividend is 3%, Inflation 2% per year
    dividend = balance * 0.03;
    inflation = inflation * years;
    infDividend = dividend - (dividend * inflation);
    infBalance = balance - (balance * inflation);

    // OUTPUT HERE
    // balanceTextField.setText("" + balance);
    // totalTextField.setText("" + totalInvested);
    // dividendTextField.setText("" + dividend);
    // infBalanceTextField.setText("" + infBalance);
    // infDividendTextField.setText("" + infDividend);

  }

  public static double Compound(double yrate, double mrate, double monthly, double balance) {

    // Variables
    double monthYield, yearTotal = 0;

    // Run for every month
    for (int i = 1; i < 13; i++) {

      // Basically magic
      yearTotal += monthly;
      monthYield = yearTotal * mrate;
      yearTotal += monthYield;
    }

    balance += (balance * yrate); // Compound for entire balance
    balance += yearTotal; // Compound for this specific year

    return balance;
  }
}
