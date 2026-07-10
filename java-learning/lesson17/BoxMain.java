package lesson17;

public class BoxMain{
   public static void main(String[] args) {
	Box<String> string = new Box<>("Hello");
	System.out.println(string.getContent());

	Box<Integer> integer = new Box<>(123);
	System.out.println(integer.getContent());

	Double[] doubleArray = {1.1, 2.2, 3.3};
	Integer[] integerArray= {1, 2, 3};

	Box.printNumberArray(doubleArray);
	Box.printNumberArray(integerArray);
   }
}