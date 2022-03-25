package practiceProgram;

import java.util.Scanner;

public class ArmstrongNumberProgram {

	public static void main(String[] args) {
		{
			int mult = 1;
			int arm = 0;
			int rem;
			int len = 0;
			Scanner s = new Scanner(System.in);
			System.out.println("enter the number");
			int num = s.nextInt();

			while (num != 0) {
				num = num / 10;
				len = len + 1;

			}
			while (num != 0) {
				rem = num % 10;
				for (int i = 1; i<= len; i++) {
					mult = mult * rem;
				}
				arm = arm + mult;
				num = num / 10;
			}
			
			
			if (num == arm) {
				System.out.println("number is armstrong");
			} else {
				System.out.println("number is not armstrong ");
			}

		}
	}

}
