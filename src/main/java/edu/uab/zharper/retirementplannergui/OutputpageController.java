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

/**
 * Output Page Controller class
 *
 * @author Joe Wong <jawong1@uab.edu>
 */
public class OutputpageController implements Initializable {

  //Output text fields
  @FXML private TextField balanceTextField;
  @FXML private TextField totalInvestedTextField;
  @FXML private TextField dividendTextField;
  @FXML private TextField infBalanceTextField;
  @FXML private TextField infDividendTextField;

  /** Initializes the controller class. */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    
    //Display results
    balanceTextField.setText("$" + StaticTemp.getBalance());
    totalInvestedTextField.setText("$" + StaticTemp.getDirectlyInvested());
    dividendTextField.setText("$" + StaticTemp.getDividend());
    infBalanceTextField.setText("$" + StaticTemp.getInfBalance());
    infDividendTextField.setText("$" + StaticTemp.getInfDividend());
  }

  /** Go Back button */
  @FXML
  public void goBackClick() throws IOException {
    App.setRoot("inputpage");
  }

  /** About Page button */
  @FXML
  private void switchToAboutClick() throws IOException {
      
    //Let StaticTemp know which page you came from
    StaticTemp.setWhichPage(false);
    App.setRoot("aboutForm");
  }
}
