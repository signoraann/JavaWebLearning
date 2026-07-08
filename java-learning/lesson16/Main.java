package lesson16;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

	List<Dog> dogs = new ArrayList<>();    //?
	dogs.add(new Dog("Rex", 2));
	dogs.add(new Dog("Bob", 5));
	dogs.add(new Dog("Rick", 7));
	dogs.add(new Dog("Raf", 6));
	dogs.add(new Dog("Daizy", 8));
	dogs.add(new Dog("Snow", 1));

	System.out.println("Dogs: " + dogs);

	dogs.stream()
	         .filter((dog) -> dog.getAge() > 5)
	         .map(dog -> new Dog(dog.getName().toUpperCase(), dog.getAge()))
	         .sorted(Comparator.comparing(Dog :: getName))
	         .collect(Collectors.toList())
	         .forEach(System.out::println);
    }
}



