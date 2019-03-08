package com.javainuse.model;

public class Employee {
	private String empId;
	private String name;
	private String designation;
	private double salary;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name = name;		
	}

}