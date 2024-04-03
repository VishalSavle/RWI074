import java.util.Scanner;;
public class vovel {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any world to check its vovel or consonant");
	char ch=sc.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		System.out.println("its vovel");
	}else{
		System.out.println("its consonant");
	}
	}
}