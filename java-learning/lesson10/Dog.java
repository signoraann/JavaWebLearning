package lesson10;

public class Dog {
	private String name;
	private int age;
	
	public Dog () { } 

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
 		if (age < 0) {
		      throw new IllegalArgumentException("Age cannot be negative! Try again :)");
		}	
		this.age = age;
	}
		
	@Override
	public String toString() {
		return name + " " + age + " years old";
	}
}