package mulDimArray;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Enter rows and colmns of firts matrix: ");
		int r1 = scn.nextInt();
		int c1 = scn.nextInt();
		
		int [][] a1 = new int[r1][c1];
		
		System.out.println("Enter values of first matrix: ");
		
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				a1[i][j] = scn.nextInt();
			}
		}
		
		System.out.println("Enter rows and colmns of second matrix: ");
		
		int r2 = scn.nextInt();
		int c2 = scn.nextInt();
		
		int [][] a2 = new int[r2][c2];
		
		System.out.println("Enter values of second matrix: ");
		
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				a2[i][j] = scn.nextInt();
			}
		}
		
		if(c1 != r2) {
			System.out.println("Invalid input columns of first matrix and rows of second matrix should be same");
			return;
		}
		
		int [][] prd = new int[r1][c2];
		
		for(int i=0; i<prd.length; i++) {
			for(int j=0; j<prd[i].length; j++) {
				for(int k=0; k<c1; k++) {
					prd[i][j] = prd[i][j] + a1[i][k] + a2[k][j]; 
				}
			}
		}
		
		System.out.println("product of matrix is: ");
		for(int i=0; i<prd.length; i++) {
			for(int j=0; j<prd[i].length; j++) {
				System.out.print(prd[i][j] + " ");
			}
			System.out.println();
		}
	}

}
