package arrays;
import java.util.*;
public class InverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int [] inv_arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			int iv = arr[i];
			inv_arr[iv] = i;
		}
		
		for(int i=0; i<inv_arr.length; i++) {
			System.out.println(inv_arr[i]);
		}
		

	}

}
