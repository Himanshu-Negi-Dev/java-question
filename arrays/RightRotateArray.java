package arrays;
import java.util.*;
public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int d = scn.nextInt();
		
		rotate(arr,d);
	}
	
	
	public static void reverse(int []a, int i, int j) {
		int lo = i;
		int hi = j;
		
		while(lo<=hi) {
			int temp = a[lo];
			a[lo] = a[hi];
			a[hi] = temp;
			lo++;
			hi--;
			
		}
		
	}
	
	public static void rotate(int []a, int d) {
		d=d%a.length;
		if(d<0) {
			d=d+a.length;
		}
		//part 1
		reverse(a, 0, a.length-d-1);
		
		//part 2
		reverse(a, a.length-d, a.length-1);
		
		// part 3
		reverse(a, 0, a.length-1);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	

}
