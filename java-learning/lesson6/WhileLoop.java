package lesson6; 
import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String word = " ";
		System.out.println("Input word:");
	while(!word.equals("exit")) {
		System.out.println("Type 'exit' to stop");
		word = scanner.nextLine();
		System.out.println(word);
		}
	scanner.close();
	}
} 