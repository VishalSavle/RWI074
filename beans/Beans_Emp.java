package com.pojo.beans;

import java.io.Serializable;
// it's same as a pojo class only different is beans implements a Serializable or pojo is not implements Serializable
class Emp implements Serializable{
	private String name;
	private int EmpId;
	private String password;
	public Emp(String name, int empId, String password) {
		super();
		this.name = name;
		EmpId = empId;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
public class Beans_Emp {
	public static void main(String[] args) {
		Emp e=new Emp("Vishal Savle",121,"Simple123");
		System.out.println(e.getName());
		System.out.println(e.getEmpId());
		System.out.println(e.getPassword());
	}
}
