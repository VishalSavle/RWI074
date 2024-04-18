package Arrays;

public class Right_Rotate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
	    int	n=1;
	    System.out.println("Input arrays is: ");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    for(int i=0;i<n;i++) {
	    	int j,first;
	    	first=arr[arr.length-1];
	    	for(j=arr.length-1;j>0;j--) {
	    		arr[j]=arr[j-1];
	    	}
	    	arr[j]=first;
	    }
	    System.out.println();
	    System.out.println("after right7 rotate");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	}
}
