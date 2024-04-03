import java.util.Scanner;
class factorial{
	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to find a factorial");
		n=sc.nextInt();
		for(int i=n;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("factorial of  "+n+" is "+fact);
	}
}