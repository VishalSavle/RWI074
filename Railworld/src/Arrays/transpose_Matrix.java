package Arrays;
// Question 25
public class transpose_Matrix {
	public static void main(String[] args) {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
		int transpose[][]=new int[3][3];
		System.out.println("Original matrix is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		// transpose matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=a[j][i];
			}
		}
		System.out.println("transpose matrix is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(transpose[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
