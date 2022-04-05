package com.tyss.finalassessment;

import java.util.Iterator;
import java.util.List;

public class Display {
	void display(List<Student> list) {
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
