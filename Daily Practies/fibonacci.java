import java.util.Scanner;
class fibonacci{
	public static void main(String[] args) {
		int x=0,y=1,z,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(x+" ");
			z=x+y;
			x=y;
			y=z;
		}
	}
}