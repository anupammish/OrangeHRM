package practiceProgram;

import java.util.Scanner;

public class ModulusandDivider {

	public static void main(String[] args) {
		int num ;
		int rem;
		int quotient;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		num = s.nextInt();
		rem = num%10;
		quotient = num/10;
		System.out.println(rem);
		System.out.println(quotient);

	}

}
