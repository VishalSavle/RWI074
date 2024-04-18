package Arrays;

public class length_array {
	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 11, 3, 6};
		System.out.println("original array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println("Number of elements present in the  given array is  : "+count);
	}
}
