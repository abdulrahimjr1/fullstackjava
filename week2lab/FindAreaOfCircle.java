package week2lab;

import java.util.Scanner;

public class FindAreaOfCircle {
	
	public static void main (String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		
		double radius=scanner.nextDouble();
		
		//area=PI*radius*radius;
		double area= Math.PI * (radius*radius);
		System.out.println("Area of the circle is: "+area);
		
		//circumference=2*PI*radius
		double circumference= Math.PI*2*radius;
		System.out.println("Circumference of circle is: "+circumference);
	}

}
