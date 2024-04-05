package com.RWI;
public class All {
	int a;
	String name;
	//Static Block
	static {
		System.out.println("This is a static block");
	}
	//Constructor
	All(){
		a=120;
		name="Vishl Savle";
	}
	//method
	void show() {
		System.out.println(a+" "+name);
	}
	//Nasted Class
	static class Nasted{
		void display() {
			System.out.println("This is a nested class");
		}
	}
	//Interface
	interface allInterface{
		void intMethod();
	}
	public static void main(String[] args) {
		All ref=new All();
		ref.show();
		Nasted nes=new Nasted();
		nes.display();
		allInterface ref1=new allInterface() {
			
			@Override
			public void intMethod() {
				System.out.println("This is a interface ");
			}
		};
		ref1.intMethod();
	}
}
