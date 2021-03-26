package strings;
import java.util.*;
public class CompressionString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		String s = str.substring(0, 1);
		int count = 1;
		
		for(int i=1; i<str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr != prev) {
				if(count > 1) {
					s = s + count;
				}
				
				s = s + curr;
				count=1;
			}else {
				count++;
			}
		
		}
		
		System.out.println(s);
		
	}

}
