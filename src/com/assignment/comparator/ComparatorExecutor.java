package com.assignment.comparator;

import java.util.Arrays;

public class ComparatorExecutor {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		employees[0] = new Employee(10043, "Alia", 23);
		employees[1] = new Employee(10028, "Kareena", 30);
		employees[2] = new Employee(10087, "Anushka", 27);
		employees[3] = new Employee(10017, "Jacqueline", 23);

		Arrays.sort(employees,Employee.AgeComparator);
		System.out.println(Arrays.toString(employees));
		
		Arrays.sort(employees,Employee.NameComparator);
		System.out.println(Arrays.toString(employees));
	}
}
