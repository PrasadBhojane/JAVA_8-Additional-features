package com.java8.additinal.features;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<Long>l = new ArrayList<Long>();
		l.add(10l);
		l.add(5l);
		l.add(15l);
		l.add(4l);
		l.add(8l);
		l.add(13000l);
		System.out.println(l);
		Consumer<Long> c= i->{
			System.out.println("The square of "+i+" is "+(i*i));
		};
		l.stream().forEach(c);// for each element operation will be performed.
	}
}
//durga vid no. 11