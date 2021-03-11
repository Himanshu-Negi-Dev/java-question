package arrays;
import java.util.*;
public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int sum_of_ele = 0;
		int max_sum = Integer.MIN_VALUE;
		int si=0,ei=0,s=0;
		for(int i=0; i<arr.length; i++) {
			sum_of_ele = sum_of_ele + arr[i];
			if(sum_of_ele > max_sum) {
				max_sum = sum_of_ele;
				si=s;
				ei=i;
			}
			
			if(sum_of_ele < 0) {
				sum_of_ele = 0;
				s = i + 1;
			}
		}
		
		System.out.println("max sum is "+ max_sum);
		System.out.println("from index " + si + " to " + ei);
	}

}
