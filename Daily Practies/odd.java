import java.util.Scanner;
public class odd{
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range to find a odd number: ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++){
			if(i%2 !=0){
				System.out.println(i+" ");
			}
		}
	}
}