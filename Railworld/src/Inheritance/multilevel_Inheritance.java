package Inheritance;
class single1{
	void run() {
		System.out.println("this is run method ");
	}
}
class Double extends single1{
	void show() {
		System.out.println("This is a show method ");
	}
}
class third extends Double{
	void display() {
		System.out.println("This is a display method ");
	}
}
public class multilevel_Inheritance {
	public static void main(String[] args) {
		third t=new third();
		t.display();
		t.run();
		t.show();
	}
}
