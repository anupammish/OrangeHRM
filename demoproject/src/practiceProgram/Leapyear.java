package practiceProgram;

import java.util.Scanner;

public class Leapyear {
     
	public static void main(String[] args) {
		int year;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		year=s.nextInt();
		if (year%400==0) {
			System.out.println("The year is leap year");
		}
			if (year%4==0 && year%100!=0) {
				System.out.println("The year is leap year");
			} else {
                 System.out.println("The year is not leap year");
			}
		} 
		}
		

	


