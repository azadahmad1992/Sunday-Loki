package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
	private static final String BMW = null;
	private static final String Toyota = null;
	private static final String Ford = null;
	private static final String Audi = null;

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;										//Variable
		int[] ageLoki = new int[]{25, 30, 35, 38, 40};		//Array
		
		//Array index			 [0]  [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageLoki[4]);
		System.out.println("Total Student : " + ageLoki.length);
		
		String[] nameLoki = new String[]{"Anik", "Badsha", "Mizu", "Humayra", "Tania", "Nazia"};
		
		System.out.println("Student Name : " + nameLoki[4]);
		System.out.println("Total Student Name: " + nameLoki.length);
	
	
		//Multi-Dimensional Array
		int [][] ageLoki2D = {{25, 30, 35, 38, 40},			//[0][0] [0][1] [0][2] [0][3] [0][4]
						  		{67, 24, 51}};				//[1][0] [1][1] [1][2] [1][3] [1][4]
		
		System.out.println("Student Age 2D : " + ageLoki2D[0][3]);
		
		// Hashmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Anik", 25);
		Student.put("Badsha", 31);
		Student.put("Mizu", 28);
		Student.put("Humayra", 18);
		
		System.out.println("HashMap Student Age : "+ Student.get("Mizu"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("USA"));	
		

		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
		//HashTable store multiple data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region : " + Region.get("BD"));
	}
}



