package com.RWI;
// method overloading
public class OverLoading {
	public void run() {
	System.out.println("Blank");	
	}
	public void run(int a) {
		
		System.out.println("Single parameter: "+a);	
		}
	public void run(int a,int b) {
		
		System.out.println("Double parameter: "+a+" "+b);	
		}
	public void run(int a,String name) {
		
		System.out.println("int and String parameter: "+a+" "+name);	
		}
	public static void main(String[] args) {
		OverLoading ref=new OverLoading();
		ref.run();
		ref.run(1);
		ref.run(1,120);
		ref.run(120,"Vishal Savle");
	}
}
