package com.nitin.day7.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coll {
	
	// List, Set, Map
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("1233535", "aa emp1");
		Employee emp2 = new Employee("1233536", "AA emp1");
		Employee emp3 = new Employee("1233537", "bb emp1");
		Employee emp4 = new Employee("1233538", "bB emp1");
		Employee emp5 = new Employee("1233539", "zZ emp1");
		Employee emp6 = new Employee("1233539", "Zz emp1");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp6);
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		
		// employees.remove(7);
		
		employees.clear();
		
		Employee temp = null;
		// Array list allow duplicate object
		for(Employee employee : employees) {
			System.out.println(employee);
			if("bB emp1".equals(employee.getEmpname())) {
				temp = employee;
			}
		}
		
		employees.remove(temp);
		
		Collections.sort(employees);
		System.out.println("After sort...");

		
		for(Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
