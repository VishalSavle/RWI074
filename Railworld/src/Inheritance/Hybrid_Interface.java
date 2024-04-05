package Inheritance;
// hybrid Interface
interface P1{
	void show();
}
interface P2 extends P1{
	void show();
}
interface P3 extends P2 {
	void show();
}
class P4 implements P1,P2{

	@Override
	public void show() {
		System.out.println("This is show method");
		
	}
}
public class Hybrid_Interface {
	public static void main(String[] args) {
		P4 p=new P4();
		p.show();
	}
}
