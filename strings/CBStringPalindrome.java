package strings;
import java.util.*;
public class CBStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String str  = scn.next();
		boolean flag = true;
		if(str.length() % 3 != 0) {
			System.out.println("String is not palindrome");
			return;
		}
		for(int i=0; i<str.length(); i+=6) {
			String s1 = str.substring(i,i+3);
			String s2 = str.substring(i+3, i+6);
			String s3 = reverse_string(s1);
			
			 if(s3.equals(s2)) {
					flag=true;
				}else {
					flag=false;
					System.out.println("String is not palindrome");
					return;
				}

		}
		
		if(flag == true) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}

	public static String reverse_string(String str) {
		String s = "";
		for(int i=str.length()-1; i>=0; i--) {
			s=s+str.charAt(i);
		}
		return s;
	}
}
