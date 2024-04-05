package Inheritance;
// multiple inheritance

interface A1 {
    void show();
}

interface B1 {
    void show();
}
class C1 implements A1, B1 {
    public void show() {
        System.out.println("This is C");
    }
    
    void disp() {
        System.out.println("This is C");
    }
}
public class multiple_Inheritance {

		public static void main(String[] args) {
			C1 c=new C1();
			c.show();
	}
}
