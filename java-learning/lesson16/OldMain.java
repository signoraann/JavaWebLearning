package lesson16;
import java.util.ArrayList; 

public class OldMain{
  public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	for(int num=1; num<=10;num++) {numbers.add(num);}
	
	for(int i=0; i<numbers.size(); i++) {
		if(numbers.get(i)%2==0) { System.out.println(numbers.get(i));}
	}
     }
}