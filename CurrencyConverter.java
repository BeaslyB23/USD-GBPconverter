// Brendan Gamble
// 5.18.20
import java.text.DecimalFormat;
import java.util.Currency;  

import java.util.Scanner;
public class CurrencyConverter {
	
	public static void main (String[] args) {
	
		// Creates new scanner 
		Scanner input = new Scanner(System.in); 
		// Declares double-type variables 
		double USD = 0;
		double GBP = 0;
		double ExchangeRate = 0;
		double amount;
		double amount2;
		double ExchangeType;
		
		
		// Greets new user
		System.out.println("Welcome to the USD to GBP currency converter");
		
		
		// Prompts user to enter conversion type: 0 or 1
		System.out.println("*Enter (0) for USD to GBP *or* (1) for GBP to USD*");
		System.out.print("Please enter conversion type: ");
		ExchangeType = input.nextDouble();
		
		
		// Converts USD to British Pounds GBP
		if (ExchangeType == 0)  {
			
			
		// Notifies user that they've chosen USD to GBP conversion 	
		System.out.println("(Chosen: USD to GBP)");
			
			
		// Prompts user to enter exchange rate
		System.out.print("Please enter exchange rate of USD to GBP: ");
		ExchangeRate = input.nextDouble();
					
		 
		// Prompts user to enter the money amount
		System.out.print("Please enter amount you want to covert: $");
		amount = input.nextDouble(); 
		GBP = amount * ExchangeRate;
		DecimalFormat chosenFormat = new 
		DecimalFormat( "#########.00 " );
		
		
		// Displays money amount converted to GBP
		 System.out.print("Your amount $" + amount + " in GBP " + "is: " + chosenFormat.format(Math.abs((GBP))));
		}		 
		
	
		else {
		
		// Notifies user that they've chosen GBP to USD conversion 	
		System.out.println("(Chosen: GBP to USD)");
		
		
		// Prompts user to enter exchange rate
		System.out.print("Please enter exchange rate of GBP to USD: ");
		ExchangeRate = input.nextDouble();
		
		
		// Prompts user to enter the money amount
		System.out.print("Please enter amount you want to covert: ");
		amount = input.nextDouble(); 
		USD = amount * ExchangeRate;
		DecimalFormat chosenFormat = new 
		DecimalFormat( "#########.00 " );
				
				
		// Displays money amount converted to GBP
		System.out.print("Your amount $" + amount + " in GBP " + "is: "  + chosenFormat.format(Math.abs((USD))));
					 
	      }
	}
}

