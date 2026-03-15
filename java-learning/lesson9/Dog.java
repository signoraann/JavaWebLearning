package lesson9;

public class Dog {
	String name;
	int age;
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayInfo() {
		System.out.println(name + " " + age + " years old");
	}

	@Override
	public String toString() {
		return name + (age + "years old");
	}
}