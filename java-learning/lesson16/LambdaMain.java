package lesson16;
import java.util.ArrayList; 

public class LambdaMain{
  public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	for(int num=1; num<=10;num++) {numbers.add(num);}
	System.out.println(numbers);

	numbers.stream()
		.map(n -> n*2)
		.toList()
		.forEach(System.out::println);
     }
}