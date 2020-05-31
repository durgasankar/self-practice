package Generics;

import java.util.ArrayList;

public class Bank {
	private String name;
	private double balance = 0.00;
	private ArrayList<Double> transactions;
	public Bank(String name) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
	}
	public void depositAmount(double amount) {
		if(amount < 0) {
			System.out.println("Can not deposit negative amount");
			System.out.println("Current account balance is : "+this.balance);
		}else if(amount == 0) {
			System.out.println(" Can not add Zero amount to the account");
			System.out.println("Current account balance is : "+this.balance);
		}else {
			transactions.add(amount);
			this.balance += amount;
			System.out.println(amount+" Amount deposited Successfully");
			System.out.println("Current account balance is : "+this.balance);
		}
	}
	
	public void withdrawAmount(double amount) {
		double withdrawlAmount = - amount;
		if(withdrawlAmount < 0) {
			transactions.add(withdrawlAmount);
			this.balance += withdrawlAmount;
			System.out.println(amount+" Amount Withdrawn Successfully");
			System.out.println("Current account balance is : "+this.balance);
		}else {
			System.out.println("Can not Withdraw negative amount");
			System.out.println("Current account balance is : "+this.balance);
		}
	}
	
	public void CalculateBalance() {
		this.balance = 0;
		for(Double d : this.transactions) {
			this.balance += d;
		}
		System.out.println("Calculated balance is : "+this.balance);
	}
	

}
