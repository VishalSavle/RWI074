package Inheritance;
//single inheritance
class single{
	void run() {
		System.out.println("Dog is run");
	}
}
public class single_Inheritance extends single{
	void show() {
		System.out.println("This is a show method:");
	}
	public static void main(String[] args) {
		single s=new single();
		s.run(); //here only execute run method
		
		single_Inheritance si=new single_Inheritance();//here one obj is create but both methods are run
		si.run();
		si.show();
	}
}
