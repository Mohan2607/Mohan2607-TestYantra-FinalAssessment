package com.tyss.finalassessment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GetStudent {
	void getStudent(List<Student> list) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to get");
		int id = sc.nextInt();
		sc.close();
		Iterator<Student> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			Student s = iterator3.next();
			if (id == s.getId()) {
				System.out.println(s);
			}
		}
	}

}
