package lesson12;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dog myDog = new Dog();

		System.out.println("Input your dog's name: ");
		String inputName = scanner.nextLine();
		myDog.setName(inputName);
	
		inputAge(scanner, myDog, "Input your dog's age:  ");
		System.out.println(myDog);	
		
		inputAge(scanner, myDog,  "Change your dog's age. Input new dog's age: ");
		System.out.println(myDog);	
		scanner.close();
	}

	private static void  inputAge(Scanner scanner, Dog dog, String prompt) {
		boolean valid = false;
		while (!valid) {
			System.out.println(prompt);
			try {
			    int age = scanner.nextInt();
			    dog.setAge(age);
			    valid = true;
			} catch (IllegalArgumentException e) {
			    System.out.println(e.getMessage());
			}
			  catch (InputMismatchException e) {
			    System.out.println("Invalid input, please enter a number.");
			    scanner.nextLine();
			}
		}
		scanner.nextLine();
	}

}