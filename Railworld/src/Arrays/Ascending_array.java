package Arrays;

public class Ascending_array {
	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 11, 3, 6};
		System.out.println("Original arrays is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("after sorting : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
