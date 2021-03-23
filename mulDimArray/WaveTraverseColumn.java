package mulDimArray;
import java.util.*;
public class WaveTraverseColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		int[][] a = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j] = scn.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			if(i%2==0) {
				for(int j=0; j<col; j++) {
					System.out.print(a[i][j] + " ");
				}
			}else {
				for(int j=col-1; j>=0; j--) {
					System.out.print(a[i][j] + " ");
				}
			}
		}

	}

}
