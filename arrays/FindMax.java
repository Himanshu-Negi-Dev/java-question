package arrays;
import java.util.*;
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int [] a = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			a[i] = scn.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("max value in array: "+max);

	}

}
