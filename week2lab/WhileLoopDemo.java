package week2lab;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer below 10: ");
		number = sc.nextInt();
		
		while (number <= 10) {
			sum += number; //sum = sum + number;
			number++;
		}
		System.out.format("Sum of the numbers from while loop is: %d",sum);
	}

}
