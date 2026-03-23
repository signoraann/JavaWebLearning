package lesson10;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dog myDog = new Dog ();
		System.out.println("Input your's dog name: ");
		String inputName = scanner.nextLine();
		myDog.setName(inputName);
		System.out.println("Input your's dog age ");
		int inputAge = scanner.nextInt();
		myDog.setAge(inputAge);
		System.out.println(myDog);	
		System.out.println("Change your's dog age. Input new dog's age: ");
		int inputNewAge = scanner.nextInt();
		myDog.setAge(inputNewAge);
		System.out.println(myDog);	
		scanner.close();
	}
}