package com.mappings.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private int rollNo;
	private String name;
	
	@OneToOne
	private Laptop laptop=new Laptop();
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptops(Laptop laptop) {
		this.laptop = laptop;
	}
	public Student(int rollNo, String name,Laptop laptop) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.laptop = laptop;
	}
	
	
	
	
	
	
	
	
	
}
