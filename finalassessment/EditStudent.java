package com.tyss.finalassessment;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EditStudent {

	void editstudent(List<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id to update");
		int editid = sc.nextInt();
		ListIterator<Student> listIterator = list.listIterator();
		sc.close();
		while (listIterator.hasNext()) {
			Student s1 = listIterator.next();
			if (s1.getId() == editid) {
				System.out.println("Name:");
				String newname = sc.next();
				System.out.println("Marks:");
				int newmark = sc.nextInt();
				System.out.println("Course:");
				String newcourse = sc.next();
				listIterator.set(new Student(editid, newname, newmark, newcourse));
				System.out.println("Edited successfully!!!");
			}
		}
	}

}
