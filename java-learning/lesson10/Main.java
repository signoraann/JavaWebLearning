package lesson10;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dog myDog = new Dog ();

		System.out.println("Input your's dog name: ");
		String inputName = scanner.nextLine();
		myDog.setName(inputName);
	
		int age = inputAge(scanner, "Input your's dog age:  ");
		myDog.setAge(age);
		System.out.println(myDog);	

		int newAge = inputAge(scanner, "Change your's dog age. Input new dog's age: ");
		myDog.setAge(newAge);
		System.out.println(myDog);	
		scanner.close();
	}

	private static int inputAge(Scanner scanner, String promt) {
		System.out.println(promt);
		int age = scanner.nextInt();
		if (age < 0) {
			System.out.println("Age cannot be negative! Try again :)");
			scanner.close();
			System.exit(1);
		}
		return age;
	}	
}