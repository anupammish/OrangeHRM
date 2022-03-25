package practiceProgram;

public class PalindromeProgram {

	public static void main(String[] args) {
		String s = "mam";
		String rev = "";
		int num = 202;
		//int len = num.size
		int l = s.length()-1;
		for (int i = l; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not palindrome");
		}
	}

}
