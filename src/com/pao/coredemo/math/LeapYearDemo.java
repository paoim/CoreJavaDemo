package com.pao.coredemo.math;

import java.util.Calendar;

public class LeapYearDemo {
	
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0);
	}

	public static void main(String[] args) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String leapYear = isLeapYear(year) ? "" : "not";
		System.out.println("Current year is " + year + ", it is " + leapYear + " Leap Year.");
	}
}
