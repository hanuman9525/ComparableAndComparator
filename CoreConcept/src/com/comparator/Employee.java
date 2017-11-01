package com.comparator;

public class Employee {
	private int empEid;
	private String empName;
	private int empSalary;
	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.empEid=i;
		this.empName=string;
		this.empSalary=j;
	}
	public int getEmpEid() {
		return empEid;
	}
	public void setEmpEid(int empEid) {
		this.empEid = empEid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empEid=" + empEid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
