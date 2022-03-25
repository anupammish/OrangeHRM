package practiceProgram;

public class ReverseStringmethod2 {

	public static void main(String[] args) {
		String s = "anurag";
	    String rev = "";
	    int l =s.length()-1;
	    
          for (int i=l; i>=0; i--)
          {
        	  
			rev = rev+s.charAt(i);
		
		}
          System.out.println(rev);

	}

}
