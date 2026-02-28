package lesson7;
import java.util.Scanner;
public class TaskFive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input width (should be integer!)");
		long num1 = scanner.nextInt();
		System.out.println("Input height (should be integer!)");
		long num2 = scanner.nextInt();
		long product = multiply(num1, num2);
		long sum = add(num1, num2);
		long difference = subtract(num1, num2);
		if (num2 != 0) { 
		long quotient= divide(num1, num2);
		System.out.println("Product: " + product + "; Sum: " + sum + "; Difference: " + difference + "; Quotient: " + quotient);
		} 
		else {System.out.println("Product: " + product + "; Sum: " + sum + "; Difference: " + difference + "; Quotient: division by zero is impossible");}
		scanner.close();
	}
	
	public static long multiply(long num1, long num2) {
		return num1*num2;
	}
	
	public static long add(long num1, long num2) {
		return num1+ num2;
	}

	public static long subtract(long num1, long num2) {
		return num1-num2;
	}

	public static long divide (long num1, long num2) {
		return num1/num2;
	}
}