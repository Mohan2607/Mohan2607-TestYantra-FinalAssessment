package com.tyss.finalassessment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println("\n 1.Add Student \n 2.Edit Student \n 3.Delete Student \n 4.Display List Of Students \n 5.Get Student \n 6.Sort \n 7.Exit");
			System.out.println("Enter the choice:");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				AddStudent addStudent = new AddStudent();
				list.add(addStudent.addstd());
				break;

			case 2:
				EditStudent edit = new EditStudent();
				edit.editstudent(list);
				break;

			case 3:
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
				break;

			case 4:
				Display displayy = new Display();
				displayy.display(list);
				break;

			case 5:
				GetStudent getStd = new GetStudent();
				getStd.getStudent(list);
				break;

			case 6:
				SortDetails sortstd = new SortDetails();
				sortstd.sortby(list);
				break;

			case 7:
				System.out.println("====program ends====");
				return;

			default:
				System.out.println("invalid input");

			}

		}
	}
}
