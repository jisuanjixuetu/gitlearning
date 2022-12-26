package org.example;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyJavaFx18 extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYear = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthPayments = new TextField();
    private TextField tfTotalPayments = new TextField();
    private Button btCalculation = new Button("Calculation");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate"),0,0);
        gridPane.add(tfAnnualInterestRate,1,0);
        gridPane.add(new Label("Number of Years:"),0,1);
        gridPane.add(tfNumberOfYear,1,1);
        gridPane.add(new Label("Loan Amount"),0,2);
        gridPane.add(tfLoanAmount,1,2);
        gridPane.add(new Label("Monthly Payment:"),0,3);
        gridPane.add(tfMonthPayments,1,3);
        gridPane.add(new Label("Total Payment:"),0,4);
        gridPane.add(tfTotalPayments,1,4);
        gridPane.add(btCalculation,1,5);
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthPayments.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayments.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthPayments.setEditable(false);
        tfTotalPayments.setEditable(false);
        GridPane.setHalignment(btCalculation, HPos.RIGHT);
        btCalculation.setOnAction(e->calculateLoanPayment());
        Scene scene = new Scene(gridPane,400,250);
        primaryStage.setTitle("LoanCalculate");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void calculateLoanPayment(){
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYear.getText());
        double loanAmount = Integer.parseInt(tfLoanAmount.getText());
        Loan loan = new Loan(interest,year,loanAmount);
        tfMonthPayments.setText(String.format("$%.2f",loan.getMonthlyPayment()));
        tfTotalPayments.setText(String.format("$%.2f",loan.getTotalPayment()));
    }
}
class Loan{
    double interest;
    double year;
    double loanAmount;
    Loan(double interest, double year, double loanAmount) {
        this.interest = interest;
        this.year = year;
        this.loanAmount = loanAmount;
    }
    double getMonthlyPayment(){
        return loanAmount*Math.pow((1+interest),year)/12;
    }
    double getTotalPayment() {
        return loanAmount * Math.pow((1+interest), year);
    }
}
