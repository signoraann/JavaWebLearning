package lesson7;

public class TaskTwo {

	public static void main(String[] args) {
		String[] names = {"Kiryl", "Ann", "Nastya", "Kate", "Misha",  "Damiano", "Ivan", "Tomas", "Ethan", "Victoria"};
		for (String name : names) {greet(name);}
		}

	public static void greet(String name) {
		System.out.println("Welcome, " + name + "!");
	}
	
}