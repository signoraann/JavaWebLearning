package lesson13;

public class Animal {
	private String name;

	public Animal (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(name + " eating");
	}


	public void makeSound() {
		System.out.println("Some generic sound");
	}

}