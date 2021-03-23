package strings;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		if(isPalindrome(str)==true) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}
	
	public static boolean isPalindrome(String str) {
		String rs = reverse_string(str);
		if(str.equals(rs)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String reverse_string(String s) {
		String str="";
		
		for(int i=s.length()-1; i>=0; i--) {
			str = str + s.charAt(i);
		}
		
		return str;
	}

}
