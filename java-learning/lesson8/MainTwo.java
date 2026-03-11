 package lesson8;

public class MainTwo {
	public static void main(String[] args) {
		Dog myDog = new Dog("Husky", 3);
		Dog neighborsDog = new Dog("Doberman", 5);
		System.out.println("My dog: " + myDog + "; Neighbors dog: " + neighborsDog);
		neighborsDog.breed = "Bulldog";
		neighborsDog.age = 3;
		System.out.println("My dog: " + myDog + "; Neighbors dog: " + neighborsDog);
	}
}