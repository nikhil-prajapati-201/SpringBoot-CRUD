package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //because this is entity
@Table(name = "student") //if i not provide any name it also provide class name
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //to make auto increment id
	private int rollno;
	
	@Column(name = "name") //this is also provide auto naming
	private String name;
	
	@Column
	private float percentage;
	
	@Column
	private String branch;

	//Non-parameterized Constructor
	public Student() {
		
	}
	
	//Parameterized COnstructor
	public Student(int rollno, String name, float percentage, String branch) {
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}

	//Getter and Setter Methods for All the Private Fields
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
				+ "]";
	}
	
	
	
	
}
