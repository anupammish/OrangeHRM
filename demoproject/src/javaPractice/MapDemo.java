package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> numb = new HashMap<>();
		numb.put("one", 1);
		numb.put("two", 2);
		numb.put("three", 3);
		numb.put("four", 4);
		numb.put("five", 5);
		if (!numb.containsKey("two")) {
			numb.put("two", 24);
		}
	//or	//numb.putIfAbsent("two", 24);
		System.out.println(numb);
		for (Map.Entry<String, Integer> e : numb.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
			
			for (String key : numb.keySet()) {     // for key only iteration
				System.out.println(key);
			}
			
			
			for (Integer value : numb.values()) {  // for value only iteration
				System.out.println(value);
			}
			
			System.out.println(numb.containsKey("three"));
			System.out.println(numb.containsValue(5));
			System.out.println(numb.isEmpty());
		}

	}

}
