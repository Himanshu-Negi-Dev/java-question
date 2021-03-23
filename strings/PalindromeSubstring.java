package strings;
import java.util.*;
public class PalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				if(isPalindrome(s.substring(i,j)) == true) {
					System.out.println(s.substring(i,j));
				}
			}
		}
	}
	
	public static boolean isPalindrome(String s) {
		String str = reverse_string(s);
		if(s.equals(str)) {
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
