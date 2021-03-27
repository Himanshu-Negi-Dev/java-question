package strings;
import java.util.*;
public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		
		StringBuilder sb = new StringBuilder(str);
		
//		for(int i=0; i<str.length(); i++) {
//			int ascii = str.charAt(i);
//			String s = str.substring(i, i+1);
//			if(ascii>=65 && ascii<=90) {
//				sb.append(s.toLowerCase());
//			}else if(ascii>=97 && ascii<=122) {
//				sb.append(s.toUpperCase());
//			}
//		}
		
		for(int i=0; i<sb.length(); i++) {
			int ascii = sb.charAt(i);
			String s = sb.substring(i,i+1);
			if(ascii>=65 && ascii<=90) {
				sb.replace(i, i+1, s.toLowerCase());
			}else if(ascii>=97 && ascii<=122) {
				sb.replace(i, i+1, s.toUpperCase());
			}
		}
		

		
		System.out.println(sb);
		
	}

}
