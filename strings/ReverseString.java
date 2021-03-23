package strings;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String str = reverse_string(s);
		System.out.println(str);
		
	}
	
	public static String reverse_string(String s) {
		String str="";
		
		for(int i=s.length()-1; i>=0; i--) {
			str = str + s.charAt(i);
		}
		
		return str;
	}

}
