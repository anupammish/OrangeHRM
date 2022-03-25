package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectiondemo {

	public static void main(String[] args) {
		/*ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		System.out.println(al1.add(400));
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("anupam");
		al2.add("anurag");
		al2.add("garima");
		
		System.out.println(al2);//[anupam, anurag, garima]
		
		al1.addAll(al2);
		
		System.out.println(al1);//[100, 200, 300, 400, anupam, anurag, garima]
		
		System.out.println(al2);//[anupam, anurag, garima]
		
		System.out.println(al1.contains(500));//false
		
		System.out.println(al1.contains(200));//true
		
		System.out.println(al2.contains("anurag"));//true
		
		System.out.println(al1.isEmpty());//false
		
		System.out.println(al2.isEmpty());//false
		System.out.println(al1.size());// return the size of array means number of element in array
		System.out.println(al2.size());*/
		
		/*ArrayList al3 = new ArrayList();
		
		al3.add("mishra");
		al3.add("dubey");
		al3.add("pandey");
		al3.add("tripathi");
		al3.remove(0);//remove by index
		System.out.println(al3);
		
		al3.remove("dubey");
		System.out.println(al3);
		
		ArrayList al4 = new ArrayList();
		
		al4.add(50);
		al4.add(60);
		al4.add(70);
		al4.add("pandey");
		System.out.println(al4);
		
		al3.removeAll(al4);
		System.out.println(al3);
		
		al4.clear();// remove all element in al4
		System.out.println(al4);// remove all element in al4*/
		
		List l = new ArrayList();
		
		l.add(50);
		l.add(60);
		l.add(90);
		l.add(80);
		l.add(40);
		l.add("gorakhpur");
		l.add("basti");
		l.add("lucknow");
		l.add("varanasi");
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("element of for is"+"   "+l.get(i));
		}
		for (Object element : l) {
			System.out.println("element of for each is"+ "  " +element);
		}
        Iterator it = l.iterator();
        
        while (it.hasNext()) {
			System.out.println("element of iterator is"+ "  "+ it.next());
		}
	}

}
