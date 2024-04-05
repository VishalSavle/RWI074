package Polymorphism;
// Method overloading
public class Compile_TIme {
	void show(int a,String name) {
		System.out.println("1st method");
	}
	void show(String name,int a) {
		System.out.println("2nd method"+" "+a);
	}
	public static void main(String[] args) {
		Compile_TIme c=new Compile_TIme();
		c.show(120, "Vishal");
	}
}
