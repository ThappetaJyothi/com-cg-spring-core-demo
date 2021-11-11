package com.cg.spring.core.demo.model;

public class Employee {
	private int eid;
	private String firstname;
	private double salary;
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String firstname, double salary) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.salary = salary;
	}
	

	public Employee(int eid, String firstname, double salary, Department department) {
		super();
		this.eid = eid;
		this.firstname = firstname;
		this.salary = salary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstname=" + firstname + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", firstname=" + firstname + ", salary=" + salary + "]";
//	}
//	
	

}
