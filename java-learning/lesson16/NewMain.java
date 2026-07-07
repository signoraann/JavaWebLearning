package lesson16;
import java.util.ArrayList; 

public class NewMain{
  public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	for(int num=1; num<=10;num++) {numbers.add(num);}
	
	numbers.stream()
		.filter(n -> n%2==0)
		.forEach(n->System.out.println(n));
     }
}