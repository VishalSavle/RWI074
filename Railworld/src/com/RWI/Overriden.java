package com.RWI;
class car{
	void show() {
		System.out.println("This is show car ");
	}
}
class BMW extends car{
	void show() {
		System.out.println("This is show car name");
	}
}
public class Overriden {
	public static void main(String[] args) {
		car c=new car();
		c.show();
		car ref=new BMW();
		ref.show();
	}
}
