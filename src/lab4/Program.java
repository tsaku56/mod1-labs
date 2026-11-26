package lab4;

public class Program {

	public static void main(String[] args) {
		
		int[ ] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 }; 
		int sum = 0;
		int indexes = 0;
		
// Task 1
		
		for (int number : numbers) {
			sum += number;
		} 
		
		System.out.printf("The sum is %d%n", sum);
		
// Task 2
		
		indexes = numbers.length;
		
		double average = sum / indexes;
		
		System.out.println("The average is " + average);
		
// Task 3
		
		int minimum = 0;
		
		for (int number : numbers) {
			if (number < minimum) {
				minimum = number;
			}
		}
		
		System.out.println(minimum);
		
// Task 4
		
		int maximum = 0;
		
		for (int number : numbers) {
			if (number > maximum) {
				maximum = number;
			}
		}
		
		System.out.println(maximum);
		
// Task 5
		
		int index = 0;
	
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				index = i;
				break;
			}
		}
		
		System.out.println(index);

// Part2a
		
		String[] students = {"John", "Jim", "James", "Gerald", "Joe"}; 
		
		int[] marks = {50, 60, 70, 90, 99};
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i] + ": " + getGrade(marks[i]));
		}
		
// Part2b
		
		double startMoney = 100;
		int endMoney = 200;
		double rate = 0.05;
		int years = 0;
		
		while (startMoney < endMoney) {
			startMoney += startMoney * rate;
			years++;
		} 
		
		System.out.println("IT TOOK " + years + " many years!");
		
// Part 3
		
		multiplicationTable();
		
}
	
	public static String getGrade(int mark) {
	    if (mark < 1 || mark > 100) {
	        return "Mark must be within 1-100";
	    } else if (mark < 50) {
	        return "Fail";
	    } else if (mark <= 60) {
	        return "Pass";
	    } else if (mark <= 70) {
	        return "Merit";
	    } else {
	        return "Distinction";
	    }
	}
	
	public static void multiplicationTable() {
	    for (int col = 1; col <= 10; col++) {
	    	for (int row = 1; row <=10; row++) {
	    		System.out.printf("%5d", col * row);
	    	}
	        System.out.println();
	    }
	    
	}
}
