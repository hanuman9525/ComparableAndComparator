package com.comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(11, "Hanuman", 50000);
		Employee e1 = new Employee(12, "Dhanu", 30000);
		Employee e2 = new Employee(13, "Swati", 40000);
		Employee e3 = new Employee(14, "Angad", 60000);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);

		System.out.println("Employee Data from the List");
		System.out.println("------------------------------------------");
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}

		System.out.println("------------------------------------------");
		EmployeeComparatorByName ee = new EmployeeComparatorByName();
		list.sort(ee);
		System.out.println("After Sorting By Name");
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		System.out.println("------------------------------------------");

		System.out.println("After Sorting By Sal");
		EmpComparatorBySal salComparator = new EmpComparatorBySal();
		list.sort(salComparator);
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		System.out.println("------------------------------------------");
		EmpComparatorById compareById = new EmpComparatorById();
		list.sort(compareById);
		System.out.println("After Sorting By ID");
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
	}

}
