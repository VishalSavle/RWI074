package Inheritance;
class A{
	void show() {
		System.out.println("this is A");
	}
}
class B extends A{   // this behavior is called a hierarchical inheritance
	void disp() {
		System.out.println("This is B");
	}
}
class C extends A{   // this behavior is called a hierarchical inheritance
	void run() {
		System.out.println("This is c");
	}
}
public class hierarchical_Inheritance {
	public static void main(String[] args) {
		B b=new B();  // this behavior is called a hierarchical inheritance
		b.disp();
		b.show();
		
		C a=new C(); // this behavior is called a hierarchical inheritance
		a.run();
		a.show();
	}
}
