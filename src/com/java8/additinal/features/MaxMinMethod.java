package com.java8.additinal.features;

import java.util.ArrayList;

public class MaxMinMethod {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(4);
		l.add(3);
		l.add(25);
		System.out.println(l);
		Integer min = l.stream().min((i1,i2)->-i1.compareTo(i2)).get(); //descending order
		System.out.println("Min value: "+min);
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value: "+max);
	}
}
//on line no. 26 - inverse compareTo sorting method used. i.e.Sorting order is [25,20,10,4,3].. so min value will be 25 i.e. first value in a line
//durga vid no. 11