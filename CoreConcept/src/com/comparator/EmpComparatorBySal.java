package com.comparator;

import java.util.Comparator;

public class EmpComparatorBySal implements Comparator<Employee> {
/*
 * @By Hanuman
*/
	@Override
	public int compare(Employee ob, Employee ob2) {
		// TODO Auto-generated method stub
		return (ob.getEmpSalary()-ob2.getEmpSalary());
	}
}
