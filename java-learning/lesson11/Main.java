package lesson11;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog myDog = new Dog ();

		scanner.close();
	}

	private static void  inputAge(Scanner scanner, Dog dog, String prompt) {
		boolean valid = false;
		while (!valid) {
			System.out.println(prompt);
			int age = scanner.nextInt();
			try {
			    dog.setAge(age);
			    valid = true;
			} catch (IllegalArgumentException e) {
			    System.out.println(e.getMessage());
			}
		}
	}
}