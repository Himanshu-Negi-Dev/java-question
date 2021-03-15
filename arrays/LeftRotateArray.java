package arrays;
import java.util.*;
public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int [] arr= new int [n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int d = scn.nextInt();
		rotate(arr,d);
	}
	
	public static void rotate(int[] a,  int d) {
		int [] new_arr = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			int new_index = (i+a.length-d)%a.length;
			new_arr[new_index] = a[i];
		}
		
		for(int i=0; i<new_arr.length; i++) {
			System.out.println(new_arr[i]);
		}
		
		
	}

}
