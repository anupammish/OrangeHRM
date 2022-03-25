package practiceProgram;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		int x,y;
		int z =0;
		int w =0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number");
		x = s.nextInt();
		System.out.println("enter the second number");
		y=s.nextInt();
		z=x;
		w=y;
		x=w;
		y=z;
		System.out.println("after swapping first number is"+x);
		System.out.println("after swapping second number is"+y);
		
		
		

	}

}
