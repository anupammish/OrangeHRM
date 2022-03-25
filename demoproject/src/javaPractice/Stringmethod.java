package javaPractice;

public class Stringmethod {

	public static void main(String[] args) {
		String s1="deepak";
        String s2=" java";
        String s3="this is demo";
        //System.out.println(s1+s2);
        //System.out.println(s1.concat(s2));
        //System.out.println(s1+10+20);
        //System.out.println(10+20+s1);
        //System.out.println(10+s2+50);
        System.out.println(s1+20/10);
       // System.out.println(s1+10-5);//error
        //System.out.println(String.join(",", s1,s2));//deepak, java
        //System.out.println(String.join(":", s1,s2));//deepak: java
        //System.out.println(String.join("  ", s1,s2));
        //System.out.println(String.join(null, s1,s2));//java.lang.NullPointerException
        System.out.println(s3.subSequence(3,9));//s is d
        System.out.println(s3.substring(3));//s is demo
        System.out.println(s3.substring(3,9));//s is d
	}

}
