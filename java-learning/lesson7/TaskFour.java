package lesson7;
import java.util.Scanner;
public class TaskFour {
	public  static boolean WhatAge (int age) {
		boolean category = false;
		if (age >= 65) { category = true; } 
		return category;
	}
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you?");	
		int age = scanner.nextInt();
		boolean isSenior = WhatAge(age);
		if (isSenior) { System.out.println("Senior Citizen");}
		scanner.close();
	}

}