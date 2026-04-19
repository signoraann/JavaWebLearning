package lesson13;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name + " barking");
	}
}

