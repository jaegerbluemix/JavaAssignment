package com.assignment.comparator;

import java.util.Comparator;

class Employee implements Comparable<Employee> {
	int empid;
	String name;
	int age;

	Employee(int empid, String name, int age) {
		this.empid = empid;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee st) {
		return (this.empid - st.empid);
	}

	@Override
	public String toString() {
		return "[rollNo=" + this.empid + ", name=" + this.name + ", age=" + this.age + "]";
	}
	
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };
    
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

	public int getEmpId() {
		return empid;
	}

	public void setEmpId(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}