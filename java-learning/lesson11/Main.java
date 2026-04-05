package lesson11;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog dog1 = new Dog ("Bob", 3);
		dogs.add(dog1);
		Dog dog2 = new Dog("Rex", 2);
		dogs.add(dog2);
		Dog dog3 = new Dog("Raf", 1);
		dogs.add(dog3);
		System.out.println("The list of dogs:");
		makeDogsBark(dogs);	

		dogs.remove(dog2);
		System.out.println("The list of dogs after removing:");
		makeDogsBark(dogs);	
	}

		private static void makeDogsBark (ArrayList<Dog> dogs) {
			 for (Dog d : dogs) {
				d.bark();
			}
		}

}