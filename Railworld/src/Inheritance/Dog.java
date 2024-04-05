package Inheritance;
//Inheritance
//In inheritance constructor or static methods are not inherit by child class 
class Animal{
	void eat() {
		System.out.println("Dog is eating : ");
	}
}
public class Dog extends Animal{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
	}
}
