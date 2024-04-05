package Abstraction;
abstract class Vehicle{
	abstract void speed();
}
class bike extends Vehicle{
	void speed() {
		System.out.println("Top speed of bike is @150 km/h");
	}
	class car extends Vehicle{
		void speed() {
			System.out.println("top speed of car is @200 km/h");
		}
	}
}
public class abstraction extends Vehicle{
	@Override
	void speed() {
		System.out.println("top speed of train is @250 km/h");
	}
	public static void main(String[] args) {
		bike b=new bike();
		b.speed();
		abstraction a=new abstraction();
		a.speed();
	}
	
}
