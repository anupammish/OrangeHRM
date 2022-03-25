package javaPractice;

import java.util.Scanner;


public class ScannerClassDemo {

	
	
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("enter value of a");
		int a = x.nextInt();
		
		System.out.println("enter value of b");
		int b = x.nextInt();
        int c = a+b;
        System.out.println("sum of number is   "+c);
	}

}
