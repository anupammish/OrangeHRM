package practiceProgram;

import java.util.Scanner;

public class LeapyearSecond {

	public static void main(String[] args) {
		int year;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any year");
		year = s.nextInt();
				
		if (year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("The enetred year is leap year");
		} else {
            System.out.println("the entered year is not leap year");
		}

	}

}
