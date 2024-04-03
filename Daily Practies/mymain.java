//overriding
class car{
	void show(){
	System.out.println("Show car");
	}
}
class bmw extends car{
	void show(){
	System.out.println("Show bmw");
	}
}

	public class mymain{
		public static void main(String[] args) {
			car c=new car();
			c.show();
			car obj=new bmw();
			obj.show();
		}
	}