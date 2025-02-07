/*
 * Program to find the maximum element in the matrix
 */
public class MatrixMaxElement {
public static void main(String[] args) {
	int matrix[][]= {{1,3,34,2,1},{6,3,2,8,6},{9,4,3,2,1,5}};
	int maximum = maxElem(matrix);
	System.out.println(maximum);
}
static int maxElem(int mat[][]) {
	int max= 0;
	for(int i =0;i<= mat.length-1;i++) {
		for(int j=0;j<mat[i].length-1;j++) {
//			if(mat[i][j]>max) {
//				max= mat[i][j];
//			}
			max= Math.max(mat[i][j],max);
		}
		
	}
	return max;
}
}
