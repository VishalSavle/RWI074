import java.util.Scanner;
class palindrome{
	public static void main(String[] args) {
		int num,rev=0,rem,comp;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		comp=num;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==comp){
			System.out.println("Its a palindrome number: ");
		}else{
			System.out.println("Its not a palindrome number");
		}
	}
}