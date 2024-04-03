
class all{
	int a;
	String name;
	static{
		System.out.println("Its a Static block");
	}
	all(){
		a=120;
		name="Vishal";
	}
	void show(){
		System.out.println(a+" "+name);
	}
	static class NestedClass {
        void display() {
            System.out.println("Inside NestedClass");
        }
    }
     interface allInterface {
        void interfaceMethod(); // semicolon added here
    }
	public static void main(String[] args) {
		all ref=new all();
		ref.show();
		NestedClass obj =new NestedClass();
		obj.display();
		allInterface refe = new allInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("Inside Interface");
            }
        };
        refe.interfaceMethod();
	}
}