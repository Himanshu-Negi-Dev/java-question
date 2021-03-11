package arrays;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
			
		}
		
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
