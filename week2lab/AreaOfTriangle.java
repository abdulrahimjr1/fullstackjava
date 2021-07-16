package week2lab;

import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String args[]) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the width of the triangle: ");
		double width=scanner.nextDouble();
		
		System.out.println("Enter the height of the triangle: ");
		double height=scanner.nextDouble();
		
		//area=(width(base)*height)/2
		double area=(width*height)/2;
		
		System.out.println("The area of the triangle is: "+area);
		
	}

}
