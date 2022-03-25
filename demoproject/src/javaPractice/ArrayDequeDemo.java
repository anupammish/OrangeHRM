package javaPractice;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(10);
		adq.offerFirst(20);
		adq.offerLast(80);
		adq.offer(30);
		
		System.out.println(adq);
		
		System.out.println(adq.pollLast());
		System.out.println(adq.pollFirst());
		System.out.println(adq.poll());
		System.out.println(adq);
		adq.offer(9);
		adq.offerFirst(8);
		adq.offerLast(7);
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		

	}

}
