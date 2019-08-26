package com.revature.eval.java.core;

public class CoreJava2 {

	public static void main(String[] args) {
		
		
		int result = 1000000000;
		int minutes = 0;
		int hours = 0;
		int days = 0;
		int time = 0;
		int life = 0;
		int seconds = 0;
		double years = 0;
	
		seconds = result;
		minutes = seconds/60;
		hours = minutes/60;
		days = hours/24;
		
		years = days/(double) 365;
		
		System.out.println(seconds + " seconds is " + days + " days");
		System.out.println("That is "+ years + " years ");
		
		
		// TODO Auto-generated method stub

	}

}
