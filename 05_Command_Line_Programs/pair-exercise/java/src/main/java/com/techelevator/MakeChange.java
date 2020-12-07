package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */


public class MakeChange 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the amount of the bill: ");
		String billAmountInput = scanner.nextLine();
		
		double amountOfBill = Double.parseDouble(billAmountInput);
		
		
		System.out.print("Please enter amount tendered: ");
		String amountTenderedInput = scanner.nextLine();
		
		double amountTendered = Double.parseDouble(amountTenderedInput);
		
		
		// changeReturned(amountOfBill, amountTendered);
		double change = changeReturned(amountOfBill, amountTendered);
		
		System.out.println("Change required: " + change);
		
	}

	
	public static double changeReturned(double amountOfBill, double amountTendered)
	{
		double change =	amountTendered - amountOfBill;
		return change;
	}
	
	
}
