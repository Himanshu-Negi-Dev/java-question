package mulDimArray;
import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int rows = scn.nextInt();
		int cols = scn.nextInt();
				
		int [][] arr1 = new int[rows][cols];
		int [][] arr2 = new int[rows][cols];
		
		System.out.println("Enter first matrix: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr1[i][j] = scn.nextInt();
			}
		}
		
		System.out.println("Enter second matrix: ");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr2[i][j] = scn.nextInt();
			}
		}
		
		int[][] arr3 = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
