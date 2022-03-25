package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<Integer> numb = new ArrayList<Integer>();
		numb.add(10);
		numb.add(20);
		numb.add(31);
		numb.add(45);
		numb.add(32);
		numb.add(22);
		
		System.out.println("minimum value of element is = "+Collections.min(numb));
		System.out.println("maximum value of element is = "+Collections.max(numb));
		System.out.println("minimum value of element is = "+Collections.frequency(numb, 20));
		

	}

}
