package practiceProgram;

import java.util.Scanner;

public class OddEvenProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if (num%2==0) {
			System.out.println("Number is prime");
		} else {
            System.out.println("Number is not prime");
		}
		

	}

}

