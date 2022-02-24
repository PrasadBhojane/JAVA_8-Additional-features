package com.java8.additinal.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeAndPeriod {

	public static void main(String[] args) {
		
		//to print present date..
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//to print date as per our required format..
		int dd = today.getDayOfMonth();
		int mm = today.getMonthValue();
		int yyyy=today.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);//printf method
		System.out.println();
		
		//to print current time..
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//-----------------------------------------------------------------------------------------
				
		//another method to print date and time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); //default format
		
		//to print in required format..
		int dd1 = dt.getDayOfMonth();
		int mm1 = dt.getMonthValue();
		int yyyy1=dt.getYear();
		System.out.printf("Date: %d-%d-%d",dd1,mm1,yyyy1);//using printf method
		
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int n = dt.getNano();
		System.out.printf("\nTime: %d:%d:%d:%d",h,m,s,n);//using printf method
		
		//------------------------------------------------------------------------------------
		
		// to print PREDEFINED date and time..
		LocalDateTime birthday = LocalDateTime.of(1992, Month.SEPTEMBER, 30, 23, 45);//instead of month.september we can also take only 9.
		System.out.println("\nMy Birthdate and time: "+birthday);
		System.out.println("After 29 years: "+birthday.plusYears(29));
		System.out.println("Before 29 years: "+birthday.minusYears(29));
		
		//-------------------------------------------------------------------------------------
		
		// Period method
		LocalDate birthdate = LocalDate.of(1992, 9, 30);
		LocalDate today1 = LocalDate.now();
		
		Period p = Period.between(birthdate, today1);
		
		System.out.printf("Your age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
	}
	
}

//it is also known as JODA time api
//durga vid no.12,13,14,15
