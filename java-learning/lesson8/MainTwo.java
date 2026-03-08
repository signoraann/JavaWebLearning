 package lesson8;
import java.util.Scanner;

public class MainTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your dog's breed");
		String myDogBreed = scanner.nextLine();
		System.out.println("Input your dog's age");
		int myDogAge = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Input neighbors dog's breed");
		String neighborsDogBreed = scanner.nextLine();
		System.out.println ("Input neighbors dog's age");
		int neighborsDogAge = scanner.nextInt();
		Dog myDog = new Dog(myDogBreed, myDogAge);
		Dog neighborsDog = new Dog(neighborsDogBreed, neighborsDogAge);
		System.out.println("My dog: " + myDog + "; Neighbors dog: " + neighborsDog);
		scanner.close();
	}
}