package Arrays;
//Program to copy all elements of one array into another array
public class OneToAnother {
	public static void main(String[] args) {
		int arr[]= {12,25,65,78,79};
		int arr2[]= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		System.out.println("Original Array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Copy array ");
		for(int copyArray:arr2) {
			System.out.print(copyArray+" ");
		}
	}
}
