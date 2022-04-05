package com.tyss.finalassessment;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortDetails {
	void sortby(List<Student> list) {
		Scanner sc=new Scanner(System.in);
		System.out.println("sort the list of students");
		System.out.println("\n 1.sortbyId \n 2.SortbyName \n 3.sortbyMarks");
		System.out.println("Enter the choice for sort:");
		int choice6 = sc.nextInt();
		sc.close();
		switch (choice6) {
		case 1: {
			SortById sortById = new SortById();
			Collections.sort(list, sortById);
			System.out.println("Sorted by Id successfully!!");
			break;
		}
		case 2: {
			SortByName sortByName = new SortByName();
			Collections.sort(list, sortByName);
			System.out.println("sorted by name Successfully!!!");
			break;
		}
		case 3: {
			SortByMarks sortByMarks = new SortByMarks();
			Collections.sort(list, sortByMarks);
			System.out.println("sorted by marks Successfully!!");
			break;
		}
		}
	}

}
