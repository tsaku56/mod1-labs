package lab2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your score?");
		
		int mark = input.nextInt();
		
		if (mark > 100) {
			System.out.println("Mark must be within 0-100");
		} else if (mark < 50) {
			System.out.println("Fail");
		} else if (mark <= 50 && mark <= 60) {
			System.out.println("Pass");
		} else if (mark <= 61 || mark <= 70) {
			System.out.println("Merit");
		} else {
			System.out.println("Distinction");
		}

		input.close();
	}

}
