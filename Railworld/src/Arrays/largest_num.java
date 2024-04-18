package Arrays;

public class largest_num {
	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 11, 3, 6};
		int max=arr[0];
		
		System.out.println("original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("largest element in the give array is: "+max);
	}
}
