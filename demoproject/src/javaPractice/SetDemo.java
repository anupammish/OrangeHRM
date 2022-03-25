package javaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();
		
		st.add(23);
		st.add(2);
		st.add(44);
		st.add(54);
		st.add(21);
		
		System.out.println(st);//in hashset print the value in random order
		
		System.out.println(st.remove(44));
		
		System.out.println(st);
		
		System.out.println(st.contains(54));
		
		System.out.println(st.isEmpty());
		
		System.out.println(st.equals(23));
		
		System.out.println(st.size());
		
		st.clear();
		
		System.out.println(st);
		
        Set<Integer> st1 = new LinkedHashSet<>();
		
		st1.add(23);
		st1.add(2);
		st1.add(44);
		st1.add(54);
		st1.add(21);
		
		System.out.println(st1);//in linked hashset  print the value in order in which it is enter
		
		System.out.println(st1.remove(44));
		
		System.out.println(st1);
		
		System.out.println(st1.contains(54));
		
		System.out.println(st1.isEmpty());
		
		System.out.println(st1.equals(23));
		
		System.out.println(st1.size());
		
		st1.clear();
		
		System.out.println(st1);
		
		
		
	Set<Integer> st2 = new TreeSet<>();
	
	st2.add(23);
	st2.add(2);
	st2.add(44);
	st2.add(54);
	st2.add(21);
	
	System.out.println(st2);//in treeset  print the value in sorted order
	
	System.out.println(st2.remove(44));
	
	System.out.println(st2);
	
	System.out.println(st2.contains(54));
	
	System.out.println(st2.isEmpty());
	
	System.out.println(st2.equals(23));
	
	System.out.println(st2.size());
	
	st2.clear();
	
	System.out.println(st2);
	
	
}
	

}
