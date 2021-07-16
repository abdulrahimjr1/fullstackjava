package week2lab;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows, number = 1, counter, j;
		//to get the users input
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd triangle:");
		
		//copying user input into sn integer variable named rows
		rows = input.nextInt();
		System.out.println("Floyd's Triangle");
		System.out.println("**********************************");
		
		for (counter =1; counter<=rows; counter++) {
			for (j=1; j<=counter;j++) {
				System.out.print(number+" ");
				//Incrementing the number value
				number++;
			}
			System.out.println(); //newline
			
				
			}
		}
	}


