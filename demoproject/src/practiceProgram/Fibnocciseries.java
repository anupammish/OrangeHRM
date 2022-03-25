package practiceProgram;

import java.util.Scanner;

public class Fibnocciseries {

	public static void main(String[] args) {
		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = s.nextInt();
		
		System.out.println("Enter the second number");
		b = s.nextInt();
		
		System.out.print(a+"  "+b);
		

		
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			
			System.out.print("  "+c);
			
			a = b;
			b = c;
		}

	}

}
