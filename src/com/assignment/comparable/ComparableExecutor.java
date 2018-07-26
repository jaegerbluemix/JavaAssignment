package com.assignment.comparable;

import java.util.Arrays;

public class ComparableExecutor {

	public static void main(String[] args) {
		
		Student[] students = new Student[4];
		students[0] = new Student(43,"Alia",23);
		students[1] = new Student(28,"Kareena",30);
		students[2] = new Student(87,"Anushka",27);
		students[3] = new Student(17,"Jacqueline",23);
		
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
	}

}
