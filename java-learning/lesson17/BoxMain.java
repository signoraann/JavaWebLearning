package lesson17;

public class BoxMain{
   public static void main(String[] args) {
	Box<String> string = new Box<>("Hello");
	System.out.println(string.getContent());

	Box<Integer> integer = new Box<>(123);
	System.out.println(integer.getContent());

	String[] stringArray = {"A", "B", "C"};
	Integer[] integerArray= {1, 2, 3};

	Box.printArray(stringArray);
	Box.printArray(integerArray);

	System.out.println(Box.doubleValue(5));
	System.out.println(Box.doubleValue(4.5));
   }
}