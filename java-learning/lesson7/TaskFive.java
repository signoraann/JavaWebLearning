package lesson7;
import java.util.Scanner;
public class TaskFive {
	public static int Multiply(int width, int height) {
		return width*height;
	}
	
	public static int Add(int width, int height) {
		return width+height;
	}

	public static int Subtract(int width, int height ) {
		return width-height;
	}

	public static int Divide (int width, int height) {
		return width/height;
	}

public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input width (should be integer!)");
		int width = scanner.nextInt();
		System.out.println("Input height (should be integer!)");
		int height = scanner.nextInt();
		int product = Multiply(width, height);
		int sum = Add(width, height);
		int difference = Subtract(width, height);
		int quotient= Divide(width, height);
		System.out.println("Product: " + product + "; Sum: " + sum + "; Difference: " + difference + "; Quotient: " + quotient);
		scanner.close();
	}
}