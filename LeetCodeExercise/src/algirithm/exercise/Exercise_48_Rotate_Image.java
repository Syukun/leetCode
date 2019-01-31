package algirithm.exercise;

public class Exercise_48_Rotate_Image {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] tmp = new int[n][n];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				int index = (n-j-1)*n+i;
				int row = index/n;
				int col = index%n;
				tmp[i][j] = matrix[row][col];
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				matrix[i][j]=tmp[i][j];
			}
		}
	}
}
