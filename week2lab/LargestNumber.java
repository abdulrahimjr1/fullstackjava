package week2lab;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//double n1=55.55,n2=77.12,n3=112.65485;

Scanner input = new Scanner(System.in);	//scanner reader and scan works!, find out
System.out.println("Enter three numbers");
//int n1,n2,n3 = reader.nextInt(), reader.nextInt(), reader.nextInt();
		

double n1 = input.nextDouble();
double n2 = input.nextDouble();
double n3 = input.nextDouble();

if (n1>=n2 && n1>=n3)
	System.out.println("largest number : "+n1);
else if (n2>=n1 && n2>=n3)
	System.out.println("largsest number : "+n2);
if (n3>=n1 && n3>=n2)
	System.out.println("largest number : "+n3);
		
	}

}
