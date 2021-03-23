package mulDimArray;
import java.util.*;
public class WaveTraverseRow {

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
		
		for(int j=0; j<col; j++) {
			if(j%2==0) {
				for(int i=0; i<row; i++) {
					System.out.print(a[i][j]+ " ");
				}
			}else {
				for(int i=row-1; i>=0; i--) {
					System.out.print(a[i][j]+ " ");
				}
			}
		}
	}

}
