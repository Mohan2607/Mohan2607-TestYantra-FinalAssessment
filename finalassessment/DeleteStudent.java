package com.tyss.finalassessment;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteStudent {
	void delete(List<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id to delete");
		int deleteid = sc.nextInt();
		Iterator<Student> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Student s = iterator2.next();
			if (s.getId() == deleteid) {
				list.remove(s);
			}
		}
		System.out.println("id " + deleteid + " is deleted");

	}

}
