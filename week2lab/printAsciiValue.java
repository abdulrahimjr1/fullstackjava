package week2lab;

public class printAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch= 'H';
		int ascii = ch;	
		
		//you can also cast char to int
		int castascii = (int)ch;
		
		System.out.println("The Ascii value of '" + ch + "' is : " + ascii);
		System.out.println("The Ascii value of '" + ch + "' is : " + castascii);
	}

}
