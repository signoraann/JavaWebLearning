package lesson7;
import java.util.Scanner;
public class TaskFour {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you?");	
		int age = scanner.nextInt();
		boolean isSenior = defineSenior(age);
		if (isSenior) { System.out.println("Senior Citizen");}
		scanner.close();
	}
	
		public  static boolean defineSenior(int age) {
		return age >= 65;
	}
}