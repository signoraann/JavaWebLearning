package lesson14;

public abstract class Animal {
	private String name;

	public Animal(String name) {
	     this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(name + " eating");
	}

	public abstract void makeSound();
	
}