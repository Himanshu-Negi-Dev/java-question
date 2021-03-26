package strings;
import java.util.*;
public class CompressionString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn  = new Scanner(System.in);
		String s = scn.next();
		String str = string_compress(s);
		System.out.println(str);
	}
	
	public static String string_compress(String s) {
		String str = s.substring(0,1);
		
		for(int i=1; i<s.length(); i++ ) {
			char curr = s.charAt(i);
			char prev = s.charAt(i-1);
			
			if(curr != prev) {
				str = str + curr;
			}
		}
					
		return str;
	}

}
