package Arrays;
//Question 29
public class matrix_eql_or_not {
	public static void main(String[] args) {
		boolean check=true;
		 int a[][] = {       
                 {1, 2, 3},    
                 {8, 4, 6},    
                 {4, 5, 7}    
             };      
 int b[][] = {       
                 {1, 2, 3},    
                 {8, 4, 6},    
                 {4, 5, 7}    
     };    
 int row=a.length;
 int col=a[0].length;
 
 int row1=a.length;
 int col1=a[0].length;
 if(row!=row1 || col!=col1) {
	 System.out.println("matrix are not equal ");
 }
 else {
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			if(a[i][j]!=b[i][j]) {
				check=false;
			}
		}
	}
	if(check) {
		System.out.println("Matrix are equal: ");
	}else {
		System.out.println("Matrix are not equal: ");
	}
 }
	}
}
