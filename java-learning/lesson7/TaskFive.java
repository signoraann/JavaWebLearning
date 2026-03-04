package lesson7;
import java.util.Scanner;
public class TaskFive {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input num1 (should be integer!)");
		int num1 = scanner.nextInt();
		System.out.println("Input num2 (should be integer!)");
		int num2 = scanner.nextInt();
		long product = multiply(num1, num2);
		long sum = add(num1, num2);
		long difference = subtract(num1, num2);
		if (num2 != 0) { 
		double quotient= divide(num1, num2);
		System.out.println("Product: " + product + "; Sum: " + sum + "; Difference: " + difference + "; Quotient: " + quotient);
		} 
		else {System.out.println("Product: " + product + "; Sum: " + sum + "; Difference: " + difference + "; Quotient: division by zero is impossible");}
		scanner.close();
	}
	
	public static long multiply(int num1, int num2) {
		return (long) num1*num2;
	}
	
	public static int add(int num1, int num2) {
		return num1+ num2;
	}

	public static int subtract(int num1, int num2) {
		return num1-num2;
	}

	public static float divide (int num1, int num2) {
		return (float) num1/num2;
	}
}