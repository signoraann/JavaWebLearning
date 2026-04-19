package lesson13;

public class Animal {
	public String name;

	public Animal (String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " eating");
	}


	public void makeSound() {
		System.out.println("Some generic sound");
	}

}