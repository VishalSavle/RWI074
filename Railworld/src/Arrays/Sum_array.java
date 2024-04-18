package Arrays;

public class Sum_array {
	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 11, 3, 6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of the all the elements is : "+sum);
	}
}
