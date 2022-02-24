package com.java8.additinal.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreamFilterMethod {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(15);
		l.add(20);
		l.add(35);
		l.add(40);
		l.add(55);
		System.out.println(l);
		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());//filter method
		System.out.println(l1);
	}
}
//stream filter method
//java 8 features by durga vid no.11