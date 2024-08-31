package project5;

import java.util.*;

/*
Meets: Summer 2022
Description: This program calculates and prints a user's tax return bill from A&A Accounting.
*/

public class projectSeven {
	
	//declaring console to input data using the scanner
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {

	//input variables
	double hourlyRate; //input variable to store the user's hourly rate
	double consultingTime; //input variable to store the user's consulting time
	double income; //input variable to store the user's income
	
	//output variables
	double billingAmount; //output variable to store the billing amount
	
	//call a method to greet users
	projectSeven.greetings();
	
	//call a method that returns either stop or continue from the user 
	String decisiontoProceed = projectSeven.getDecision();
	
while (decisiontoProceed.equalsIgnoreCase("Continue")) {
		
	//call a method that returns the yearly income
	income = projectSeven.getYearlyIncome();
	
	//call a method that returns the hourly rate
	hourlyRate = projectSeven.getHourlyRate();
	
	//call a method that returns the consulting time
	consultingTime = projectSeven.getConsultingTime();
	
	//call a method that determines the billing
	billingAmount = projectSeven.calculateBill(income,hourlyRate,consultingTime);
	
	//call a method that prints the bill
	projectSeven.printBill(income,hourlyRate,consultingTime,billingAmount);
	
	//call a method that returns either stop or continue 
	decisiontoProceed = projectSeven.getDecision();
	
}//end of while 

	//call a method to tell users goodbye
	projectSeven.goodbye();
	
}//end of main
	
	//method that prints greeting
	public static final void greetings() {
	System.out.println("Welcome to A&A Accounting");
	System.out.println("Glad to help you determine your cost for filing 2019 taxes with us");
	}
	
	//method that asks the user whether they want to stop or continue
	public static final String getDecision() {
	
	System.out.print("\nDo you want to Continue or Stop: ");
	String decisiontoProceed = console.next();
	return decisiontoProceed;
	}
	
	//method that asks the user to enter their income
	public static double getYearlyIncome() {
	System.out.print("\nEnter yearly income: ");
	double income = console.nextDouble();
	return income;
	}
	
	//method that asks the user to enter the hourly rate 
	public static double getHourlyRate() {
	System.out.print("Enter the hourly rate: ");
	double hourlyRate = console.nextDouble();
	return hourlyRate;	
	}
	
	//method that asks the user to enter the consulting time
	public static double getConsultingTime() {
	System.out.print("Enter consulting time in minutes: ");
	double consultingTime = console.nextDouble();
	return consultingTime;
	}
	
	//method that calculates the bill
	public static double calculateBill(double income, double hourlyRate, double consultingTime) {
	
	double billingAmount = 0;
	
	//if user has low income and consulting time is less than or equal to 30 minutes
	if (income <= 25000 && consultingTime <=30) {
	return billingAmount;
	}
	
	//if user has low income and consulting time is over 30 minutes 
	else if (income <=25000 && consultingTime >30) {
	billingAmount = (hourlyRate * 0.40 * ((consultingTime-30)/60));
	}
	
	//if user has income above 25000 and consulting time is less than or equal to 20 minutes
	else if (income >25000 && consultingTime <=20) {
	return billingAmount;
	}
		
	//if user has income above 2500 and consulting time is over 20 minutes
	else if (income >2500 && consultingTime >20) {
	billingAmount = (hourlyRate * 0.70 * ((consultingTime-20)/60));
	}
	return billingAmount;
	}
	//method to print the bill
	public static void printBill(double income, double hourlyRate, double consultingTime, double billingAmount) {
	System.out.printf("\nThe billing amount is: $%.2f Based on: $%.2f of Income, %.2f minutes of help and reduced rate of $%.2f per hour\n", billingAmount,income,consultingTime,hourlyRate);
	}

	//method that prints goodbye message
	public static final void goodbye() {
	System.out.println("Thanks for Visiting A&A Accounting Please allow us to file your 2019 Taxes");
	}
	
}//end of class
