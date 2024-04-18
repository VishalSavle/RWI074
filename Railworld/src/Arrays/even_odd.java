package Arrays;
//question 24
public class even_odd {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	System.out.println("Even number from the given array: ");
	for(int i=1;i<arr.length;i=i+2) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("odd number from the given array: ");
	for(int i=0;i<arr.length;i=i+2) {
		System.out.print(arr[i]+" ");
	}
}
}
