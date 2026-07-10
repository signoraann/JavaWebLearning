package lesson16;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

	List<Dog> dogs = new ArrayList<>();    
	dogs.add(new Dog("Rex", 6));
	dogs.add(new Dog("Bob", 2));
	dogs.add(new Dog("Rick", 7));
	dogs.add(new Dog("Raf", 8));
	dogs.add(new Dog("Daizy", 3));
	dogs.add(new Dog("Snow", 5));

	System.out.println("Dogs: " + dogs);

	dogs.stream()
	         .filter((dog) -> dog.getAge() > 5)
	         .sorted(Comparator.comparing(Dog::getName, String.CASE_INSENSITIVE_ORDER))
	         .forEach(System.out::println);

	int totalAge = dogs.stream()
			.map(Dog::getAge)
			.reduce(0, (a, b) -> a + b );

	System.out.println("Total dog's age: " + totalAge);
    }
}



