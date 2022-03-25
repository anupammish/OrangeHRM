package javaPractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueDemo {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		 
		q.offer("brush");//add the element in list
		q.offer("soap");
		q.offer("hairoil");
		q.offer(90);
		q.offer(80);
		q.offer(50);
		
		System.out.println(q);
		
		System.out.println(q.poll());//first in first out ,first element will delete
		System.out.println(q);
		System.out.println(q.peek());// pick the first element in the list
		

	}

}
