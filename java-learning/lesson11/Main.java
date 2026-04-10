package lesson11;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		Dog dog1 = new Dog ("Bob", 3);
		dogs.add(dog1);
		Dog dog2 = new Dog("Rex", 2);
		dogs.add(dog2);
		Dog dog3 = new Dog("Raf", 1);
		dogs.add(dog3);
		System.out.println("The list of dogs:");
		printBarks(dogs);	

		dogs.remove(dog2);
		System.out.println("The list of dogs after removing:");
		printBarks(dogs);	
	}

		private static void printBarks(List<Dog> dogs) {
			 for (Dog d : dogs) {
				d.bark();
			}
		}

}