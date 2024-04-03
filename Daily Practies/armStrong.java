import java.util.Scanner;
class armStrong{
	public static void main(String[] args) {
		int num,arm=0,rem,comp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		comp=num;
		while(num>0){
			rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;

		}
		if(arm==comp){
			System.out.println("It armStrong number");
		}else{
			System.out.println("It's not armStrong number");
		}
	}
}