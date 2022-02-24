package com.java8.additinal.features;

import java.time.Year;
import java.util.Scanner;

public class YearMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year: ");

		int n = sc.nextInt();
		Year y = Year.of(n);

		if (y.isLeap()) {
			System.out.println("Year is a leap year." + n);// printing using println method.
		} else {
			System.out.printf("%d Year is not a leap year.", n);// printing using printf method.
		}
	}
}

//*year is said leap year if it is divisible by 4.
//durga vid no. 15
