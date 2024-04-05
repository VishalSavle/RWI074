package com.RWI;
class Mahindra{
	void show() {
		System.out.println("This the brand name: ");
	}
}
class Scorpio extends Mahindra{
	void show() {
		System.out.println("This is the product name: ");
	}
}
public class Casting {
	public static void main(String[] args) {
		Mahindra m=new Scorpio(); // upcasting
		m.show();
		Scorpio s=(Scorpio)m;  // downcasting
		s.show();
		
	}
}
