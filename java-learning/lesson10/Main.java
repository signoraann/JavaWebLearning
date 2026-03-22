package lesson10;

public class Main {
	public static void main(String[] args) {
		Dog myDog = new Dog ("Woof", 3);
		System.out.println(myDog);
		myDog.name = "Rex";
		System.out.println(myDog);
	}
}