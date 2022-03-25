package javaPractice;

public class StringbufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("deepak");
		System.out.println(sb.capacity());
		sb.append("deepak java trainer");
		System.out.println(sb.capacity());// 34
		StringBuffer sb1 = new StringBuffer("deepak java");//
		System.out.println(sb1.append("hi"));// deepak javahi ,append method
												// concat the string
		System.out.println(sb1.length());// 13
		System.out.println(sb1.charAt(3));// return the character at that
											// index,0123,deep,p
		// System.out.println(sb1.delete(2, 4));
		System.out.println(sb1.deleteCharAt(3));// deeak javahi
		StringBuffer sb2 = new StringBuffer("hi anupam");
		StringBuffer sb3 = new StringBuffer("hi anupam");
		System.out.println(sb2.equals(sb3));// output false// equal method in
											// string does not override but in
											// string class it will over ride
											// the method
		System.out.println(sb3.reverse());
		String s = new String("anupam");
		int l = s.length();
		String rev="";
		for (int i=l-1; i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);//mapuna
			
			
		}
		
		

	}

}
