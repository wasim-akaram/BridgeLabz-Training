package com.generics.universitycoursemanagement;

import java.util.ArrayList;

public class Display {

	public static void display(ArrayList<? extends CourseType> arr) {
		arr.stream().forEach(x->x.details());
	}
}