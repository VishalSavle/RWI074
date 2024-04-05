package com.pojo.beans;
// all variables are private and contains a getter setter and and encapsulate the objects
class pojo{
	private int Emp_Id;
	private String name;
	private String password;
	public pojo(int emp_Id, String name, String password) {
		super();
		Emp_Id = emp_Id;
		this.name = name;
		this.password = password;
	}
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
public class Pojo_Emp{
	public static void main(String[] args) {
		pojo p=new pojo(120,"Vishal Savle","Simple");
		System.out.println(p.getEmp_Id());
		System.out.println(p.getName());
		System.out.println(p.getPassword());
	}
}