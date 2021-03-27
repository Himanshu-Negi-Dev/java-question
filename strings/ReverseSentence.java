package strings;
import java.util.*;
public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder();
		int ri = str.length();
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == ' ' && ri==str.length()) {
				sb.append(str.substring(i+1, ri));
				ri=i;
			}
			
			if(i==0){
				sb.append(" ");
				sb.append(str.substring(i, ri));
			}
			
			if(str.charAt(i) == ' ') {
				sb.append(str.substring(i, ri));
				ri=i;
			}
		}
		
		System.out.println(sb);
	}

}
