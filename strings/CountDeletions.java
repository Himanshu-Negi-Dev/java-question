package strings;
import java.util.*;
public class CountDeletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		int count = 0;
		StringBuilder sb = new StringBuilder(str);
//		for(int i=0; i<sb.length()-1; i++) {  wrong answer
//			if(sb.charAt(i) == sb.charAt(i+1)) {
//				sb.delete(i, i+2);
//				count++;
//			}
//		}
		
		int i=0;
		while(i<sb.length()-1) {
			if(sb.charAt(i) == sb.charAt(i+1)) {
				sb.delete(i, i+2);
				count++;
			}else {
				i++;
			}
		}
		
		System.out.println(sb);
		System.out.println(count);
	}

}
