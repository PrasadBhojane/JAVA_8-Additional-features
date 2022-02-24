package com.java8.additinal.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreamMapMethod {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(15);
		marks.add(20);
		marks.add(35);
		marks.add(40);
		marks.add(55);
		System.out.println(marks);
		List<Integer> uodatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());//map method
		System.out.println(uodatedMarks);
	}
}
//stream map method
//java 8 features by durga vid no.11