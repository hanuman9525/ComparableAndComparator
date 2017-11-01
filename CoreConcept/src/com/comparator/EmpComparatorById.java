package com.comparator;

import java.util.Comparator;

public class EmpComparatorById implements Comparator<Employee>{
/*
 * @Author Hanuman
*/
	@Override
	public int compare(Employee ob, Employee ob2) {
		return (ob.getEmpEid()-ob2.getEmpEid());
	}
}
