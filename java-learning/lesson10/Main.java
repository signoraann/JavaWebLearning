package lesson10;

public class Main {
	public static void main(String[] args) {
		Dog myDog = new Dog ("Woof", 3);
		System.out.println(myDog);
		myDog.setName("Rex");
		System.out.println(myDog);
		myDog.setAge(-4);
		System.out.println(myDog);	
	}
}