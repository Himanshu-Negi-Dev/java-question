package mulDimArray;
import java.util.*;
public class SpiralTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		int[][] arr = new int[row][col];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		
		int tne = row*col;
		int cne = 0;
		while(cne<tne) {
			
			//left wall
			
			for(int i=minr, j=minc; i<=maxr && cne<tne ; i++) {
				System.out.println(arr[i][j]);
				cne++;
			}
			minc++;
			
			// bottom wall
			
			for(int i=maxr, j=minc; j<=maxc && cne<tne; j++) {
				System.out.println(arr[i][j]);
				cne++;
			}
			maxr--;
			
			//left wall
			for(int i=maxr, j=maxc; i>=minr && cne<tne; i--) {
				System.out.println(arr[i][j]);
				cne++;
			}
			maxc--;
			
			for(int i=minr, j=maxc; j>=minc && cne<tne; j--) {
				System.out.println(arr[i][j]);
				cne++;
			}
			minr++;
		}
		
		
		
		
	}

}
