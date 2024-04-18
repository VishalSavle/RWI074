package Arrays;

public class smallest_array {
	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 11, 3, 6};
		int min=arr[0];
		
		System.out.println("original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("smallest element in the give array is: "+min);
	}
}
