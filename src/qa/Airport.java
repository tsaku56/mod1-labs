package qa;

import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double finalTotal = 0;
		
// Find the customer type and define tax rate
		
		System.out.println("Are you a (R)egular or (V)ip?");
		
		String customer = input.nextLine();
		
		double taxRate = customer.equalsIgnoreCase("R") ? 0.1 : 0.05; 
		
// Find the currency type and feedback		
		
		System.out.println("What currency do you want to exchange in GBP? Choices are USD, EUR, JPY");
		
		String currency = input.nextLine();
		
		if (currency.equals("USD") || currency.equals("EUR") || currency.equals("JPY")) {
		    System.out.println("You've selected " + currency + ". ");
		}
		
// Find the amount, work out amount after serve fee, then tax fee and total amount ready for conversion	
		
		System.out.println("How much GBP do you want to exchange?");
		
		double amount = input.nextDouble();
		
		double servFee = (amount < 100) ? 0.05 : 0.025;
		
		double afterServFee = amount - (amount * servFee);
		
		double afterTaxRate = afterServFee - (afterServFee * taxRate);
		
// Switch based on currency type, total amount converted to chosen currency and summary of fees	
		
		switch (currency) {
		case "USD": {
			finalTotal = afterTaxRate * 1.25;
			System.out.println("Servive Fee: " + (servFee * 100) + "%. Amount after fee: £" + afterServFee + ".");
			System.out.println("Tax Rate: " + (taxRate * 100) + "%. Amount after fee: £" + afterTaxRate + ".");
			System.out.println("Your converted amount is " + (int) finalTotal + " in " + currency + ".");
		} break;
		case "EUR": {
			finalTotal = afterTaxRate * 1.15;
			System.out.println("Servive Fee: " + (servFee * 100) + "%. Amount after fee: £" + afterServFee + ".");
			System.out.println("Tax Rate: " + (taxRate * 100) + "%. Amount after fee: £" + afterTaxRate + ".");
			System.out.println("Your converted amount is " + (int) finalTotal + " in " + currency + ".");
		} break;
		case "JPY": {
			finalTotal = afterTaxRate * 180.5;
			System.out.println("Servive Fee: " + (servFee * 100) + "%. Amount after fee: £" + afterServFee + ".");
			System.out.println("Tax Rate: " + (taxRate * 100) + "%. Amount after fee: £" + afterTaxRate + ".");
			System.out.println("Your converted amount is " + (int) finalTotal + " in " + currency + ".");
		} break;
		default:
			System.out.println("Incorrect currency selected.");
			break;
	}
		input.close();
	}
}
