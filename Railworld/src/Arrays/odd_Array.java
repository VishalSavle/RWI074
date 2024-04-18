package Arrays;

public class odd_Array {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Original Arrays: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("odd number present in the give array");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		} 
	}
}
