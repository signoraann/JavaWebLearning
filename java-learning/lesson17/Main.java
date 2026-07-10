package lesson17;
import java.util.List;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Hello");
	list.add(19); //error: incompatible types: int cannot be converted to String
   }
}
//ArrayList<String> is safer than just ArrayList because the type of added elements is checked at compile time, there is no need for manual type casting when you get elements from the list, and the code shows what type of elements the list stores