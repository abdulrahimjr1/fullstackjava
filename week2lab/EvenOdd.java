package week2lab;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in); 

		System.out.println("Enter a number: ");
		int num = reader.nextInt();
		
	//if number divisible by 2 then its even number, else odd
		
		if (num%2==0) 
			System.out.println("Entered number is even");
		else 
			System.out.println("Entered number is odd");
			


	}

}
