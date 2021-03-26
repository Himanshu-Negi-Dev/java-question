package strings;
import java.util.*;
public class FirstCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
		String rs = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				
				if(i==0) {
					rs = rs + s.substring(i,i+1);
				}else if(s.charAt(i-1) == ' ') {
					rs = rs + s.substring(i,i+1);
				}
				
			}
		}
		
		System.out.println(rs);
	}

}
