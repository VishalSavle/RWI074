package Polymorphism;
//Method overriding
class runtime{
	void run(int a) {
		System.out.println("1st method"+" "+a);
	}
}
public class Runtime_Polymorphism extends runtime{
	void run(int a) {
		System.out.println("2nd method"+" "+a);
	}
	public static void main(String[] args) {
		runtime r=new runtime();
		r.run(10);
		Runtime_Polymorphism p=new Runtime_Polymorphism();
		p.run(120);
	}
}
