package strings;
import java.util.*;
public class StringNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		
		System.out.println(findSum(str));
		
	}
	
	public static long findSum(String s) {
		String temp = "0";
		long sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			int asci = s.charAt(i);
			
			if(asci>=48 && asci<=57) {
				temp = temp + s.charAt(i);
			}else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);
		
		return sum;
	}

}
