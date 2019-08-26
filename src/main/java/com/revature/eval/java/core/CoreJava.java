package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CoreJava {

	public CoreJava(String yourSentance) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//to reverse a string
		String willReverse;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter in a string : ");
		willReverse = scan.nextLine();
		// make user input = scanner
		char [] ch = willReverse.toCharArray();
		//create a array that equals length of user inout
		System.out.println("reverse of string is: ");
		int j = ch.length;
		// sets the incerment to character length
		for(int i = j; i>0;i--) {
			System.out.println(ch[i-1]);
		}
		
		// Write the Acronym of a string
		String userAcronym;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter something you want me to get the Acronym of");
		userAcronym = scan2.nextLine();
		String result = userAcronym.replaceAll("\\B.|\\P{L}","").toUpperCase();
		System.out.println(result);
		
		
		// TODO Auto-generated method stub

	
	// check if a triangle is equailateral, isosceles or scalene
		Scanner sc3 = new Scanner(System.in);
	int side1 =0;
	int side2 =0;
	int side3 =0;
	System.out.println("enter the sides of the triangle you want to compare");
	System.out.println(" enter in value, side 1: ");
	side1 = sc3.nextInt();
	System.out.println(" enter in value, side 2: ");
	side2 = sc3.nextInt();
	System.out.println(" enter in value, side 3: ");
	side3 = sc3.nextInt();
	
	//equalaterial all sides are the same
	// isosceles trinage two sides are equal
	//scalene no sides are equal
	// to check if triangle the sum of 2 sides must be greater than a side
	if((side1 + side2 > side3)) {
		//checking if its equalateral, all sides are equal
		// why do u need double parenthasis??????
		if((side1 == side2) && (side2 ==side3)){
			System.out.println("Your triangle is a Equalateral Triangle");
		}
		//checking if its a Isosceles Triangle
		// why use ||?
//		else if ((side1 == side2) & (side2 != side3) || ()
			System.out.println("Your triangle is a Isoscels Triangle");
		} 
			
	// use hashmap when counting frequencey of objects
				Scanner sc4 = new Scanner(System.in); 
				
				String userPhrase = null;
				
				
				
				System.out.println("enter a phrase and i will count how many times you use each word ");
				System.out.println("enter your phrase");
				
				userPhrase = sc4.nextLine(); 
				HashMap <String, Integer> howMany = new HashMap <String, Integer>();
				String [] a = userPhrase.split(" ");
				for(int i = 0; i < a.length; i++) {
					String key = a[i];
					int freq = howMany.getOrDefault(key, 0);
					howMany.put(key, ++freq);
				}
				for (Entry<String, Integer> result1 : howMany.entrySet()) {
					System.out.println(result1.getKey() + " " + result1.getValue());
				}
				//-----------------end of problem 3------------------------//
				
				// simple math problems
				System.out.println(" we will be adding numbers ");
				Scanner sc5 = new Scanner(System.in);
				int value1 = 0;
				int value2 = 0;
				int total = 0;
				Scanner sc6 = new Scanner(System.in);
				
				 
				 System.out.println(" enter in the 2 values you want to add");
				
				value1 = sc5.nextInt();
				value2 =  sc5.nextInt();
				
				System.out.println("chose what operation to exceute 'add' or 'minus' ");
				String choice = sc6.nextLine();
				
				switch (choice) {
				
				case "add" :
					System.out.println(" adding numbers ");
					total = value1 + value2;
					System.out.println(" the sum of " + value1 +" and "+ value2 + " :"+ total);
					break;
					
				case "minus" :
					System.out.println(" subtracting numbers ");
					total = value1 - value2;
					System.out.println(" the sum of " + value1 +" and "+ value2 + " :"+ total);
					
				
				}
			//---------------------------determine if sentance is a panagram------------------------------------------//
				
				 Set<Character> lettersLeft = new HashSet<>();
				Scanner sc7 = new Scanner (System.in);
				String yourSentance;
				System.out.println("we will be checking if your sentace uses each letter in the alphabet");
				System.out.println("PLease enter your sentance");
						yourSentance = sc7.nextLine();
				// constructor is used to set the values?
				public coreJava (yourSentance){
					for(char ch = 'a'; ch <= 'z'; ch++) {
						lettersLeft.add(ch);
					}
					for( int i = 0; i < yourSentance.length(); i++) {
						lettersLeft.remove(yourSentance.charAt(i));
					}
				}
			
	//--------------------------------------Calculate the moment when someone has lived for 10^9 seconds----------------//
				10^9
				
				int life = 0;
				int seconds = 10^9; 
				System.out.println(time);
				int minutes = 0;
				int hours = 0;
				int days = 0;
				 
				double resu
				
				minutes = time/60;
				hours = minutes/60;
				days = hours/24;
				
				
				System.out.println(seconds + " seconds is " + days);
				
				
				
	
				
		}
	}



