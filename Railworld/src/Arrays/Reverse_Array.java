package Arrays;

import java.util.Scanner;

public class Reverse_Array {
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		size=sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements is:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse array elements is:");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
