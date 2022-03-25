package javaPractice;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int[] num = {10,5,8,9,20,89,70,85,90};
		Arrays.sort(num);
		int index = Arrays.binarySearch(num, 89);
		System.out.println("index value of searched number is"+ index);
		
		int[] list = {4,3,98,65,45,44,8,54};
		
		Arrays.sort(list);
		for (int i : list) {
			System.out.println(i);
		}
		
		Arrays.fill(list, 0, 3, 21);
		
		System.out.println(list);

	}

}
