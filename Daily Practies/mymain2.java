//upcasting
class Mahindra{
	void show(){
	System.out.println("Show car");
	}
}
class Scorpio extends Mahindra{
	void show(){
	System.out.println("Show car name  Scorpio");
	}
}

	public class mymain2{
		public static void main(String[] args) {
			//upcasting
			Mahindra ref=new Scorpio();
			ref.show();
			//downcasting
			Scorpio s=(Scorpio)ref;
			s.show();
		}
	}