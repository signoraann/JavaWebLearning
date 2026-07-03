package lesson14;
import java.util.ArrayList;
public class Main {
       public static void main(String[] args) {
	ArrayList<Payable> people =  new ArrayList<>();
	people.add(new Employee(6, 20));
	people.add(new Contractor(7));

	double workHours = 160;
	for (Payable p : people)  {
	System.out.println("Payment: " + p.calculatePay(workHours));
	}
  }
}