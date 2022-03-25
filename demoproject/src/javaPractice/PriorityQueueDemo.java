package javaPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(10);
		pq.offer(5);
		pq.offer(20);
		pq.offer(6);
		pq.offer(30);
		pq.offer(40);
		System.out.println(pq);// minimum value will retrieve first

		System.out.println(pq.poll());// remove the minimum value elent first
										// and then minimum value elent come
										// first
		System.out.println(pq);

		System.out.println(pq.peek());

	}
	/*PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
	pq1.offer(10);
	pq1.offer(5);
	pq1.offer(20);
	pq1.offer(6);
	pq1.offer(30);
	pq1.offer(40);
	System.out.println(pq1);// max value will retrieve first

	System.out.println(pq1.poll());// remove the max value elent first
									// and then max value elent come
									// first
	System.out.println(pq1);

	System.out.println(pq1.peek());*/


}

