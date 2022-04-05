package com.tyss.finalassessment;

import java.util.Scanner;

public class AddStudent {
	Student addstd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id,name,marks,course");
		int Id = sc.nextInt();
		String name = sc.next();
		int marks = sc.nextInt();
		String course = sc.next();
		Student student = new Student(Id, name, marks, course);
		return student;
		
	}
}
