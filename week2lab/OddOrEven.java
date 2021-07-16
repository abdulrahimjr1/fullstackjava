package week2lab;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter an integer number : ");
		
		//the input provided by the user is store in num
		
		Scanner input = new Scanner(System.in); //reader and scan works just fine. find out more

		num = input.nextInt();
		
	//if number divisible by 2 then its even number, else odd
		
		if (num%2==0) 
			System.out.println("Entered number is even");
		else 
			System.out.println("Entered number is odd");
			
		}
}
