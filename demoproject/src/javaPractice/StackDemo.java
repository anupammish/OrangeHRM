package javaPractice;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack st = new Stack();
		 st.push("lion");
		 
		 st.push("tiger");
		 st.push("cow");
		 st.push("dog");
		 st.push("pig");
		 st.push("cat");
		  System.out.println("item in stack is "+ st);
		  System.out.println(st.peek());
		  System.out.println(st.pop());
		  System.out.println(st.peek());

	}

}
