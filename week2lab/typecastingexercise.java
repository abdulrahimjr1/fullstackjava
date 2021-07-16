package week2lab;

public class typecastingexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=10;
		int i=b; //will accept automatic type promotion
		
		short s=b;
		long l=s;
		
		byte bb=(byte)i; // will not accept int into byte type (cannot assign high to low)
		byte bbb=(byte)i; //type casting makes it possible to store compatible types 
		
		short ss=(short)l;
		
		byte x=10;
		byte y=20;
		
		//byte sum=x*y; //error is thrown cuz when two bytes are used in arithmetic oper, the result is int

	}

}


