package week2lab;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter side of square");
		//capture the user's input
		Scanner scanner=new Scanner(System.in);
		//storing the captured value in a variable
		double side=scanner.nextDouble();
		//area of square=side*side
		double area=side*side;
		System.out.println("Area of square is: "+area);

	}

}
