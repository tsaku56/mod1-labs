package lab3;

import java.util.Scanner;

public class Program {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		theLunchQueue();
	
		int weight = getInt("What is your weight in pounds?");
		convertInputToStonesPounds(weight);
		
		int kgweight = getInt("What be ye weight in keegee?");
		convertKgsToStonesPounds(kgweight);	
		
	}	
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		return s.nextInt();
	}
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		return s.nextLine();
	}

	public static void theLunchQueue() {
		String name = getString("What's your main dish? Chicken, Fish or Veg?");
		int potate = getInt("How many potato?");
		int bruss = getInt("How many Brussel?");
		System.out.println("Hi your lunch is " + name + " with " + potate + " many potatoe and " + bruss + " brusells");
	}
	
	public static void convertInputToStonesPounds(int pounds) {
		int stones = pounds / 14;
		int remainpounds = pounds % 14;
		System.out.println(stones + " stone and " + remainpounds + " pounds!");
	}
	
	static void convertKgsToStonesPounds(int kg) {
		double stones = kg * 2.20462;
		convertInputToStonesPounds((int) stones);
	}

}
