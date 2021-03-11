package arrays;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int d = scn.nextInt();
		
		int [] newArr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			int newIndex = (i+n+d) % n;
			newArr[newIndex] = arr[i];
		}
		
		
		for(int i=0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

}
