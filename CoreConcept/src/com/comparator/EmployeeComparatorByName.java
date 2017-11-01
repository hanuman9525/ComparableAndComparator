package com.comparator;

import java.util.Comparator;

public class EmployeeComparatorByName implements Comparator<Employee>{

	@Override
	public int compare(Employee ob, Employee ob2) {
		// TODO Auto-generated method stub
		return ob.getEmpName().compareTo(ob2.getEmpName());
	}

}
