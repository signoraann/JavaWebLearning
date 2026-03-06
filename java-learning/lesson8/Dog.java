package lesson8;

public class Dog{
	String breed;
	int age;
	public Dog(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}
	void bark()  {
		System.out.println("Woof!");
	}
}