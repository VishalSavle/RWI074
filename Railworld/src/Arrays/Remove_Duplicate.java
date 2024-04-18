package Arrays;
// question 21
public class Remove_Duplicate {
	public static void main(String[] args) {
		int arr[]= {1,2,7,3,7,4,4,5,6,6};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				 temp[j]=arr[i];
				 j++;
			}
		}
		arr[j]=arr[arr.length-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
			System.out.print(arr[i]+" ");
		}
	}
}
