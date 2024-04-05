package Interface;
interface a{
	public void show();
}
public class interface_ implements a {

	@Override
	public void show() {
		System.out.println("Interface is show: ");
	}
	public static void main(String[] args) {
		interface_ i=new interface_();
		i.show();
	}

}
