package com.java8.additinal.features;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdClass {

	public static void main(String[] args) {
		
		//to print our area time zone.
		ZoneId zone  = ZoneId.systemDefault();
		System.out.println(zone);
		
		System.out.println();//to print blank line
		
		
		//to print specific area time zone
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
		
		
	}
}

//durga vid no. 16