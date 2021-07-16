package week2lab;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		double length=input.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width=input.nextDouble();
		//area=length*width
		double area=length*width;
		System.out.println("Area of rectangle is: "+area);
				

	}

}
