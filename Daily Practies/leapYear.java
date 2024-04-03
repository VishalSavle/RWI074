import java.util.Scanner;
import java.time.Year;
public class leapYear{
public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to check year leapYear or not");
		year=sc.nextInt();
		if(Year.of(year).isLeap()){
			System.out.println("Year is leap");
		}else{
			System.out.println("Year is not leap");
		}
	}	
}