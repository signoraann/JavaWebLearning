package lesson6; 
import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String w = " ";
		System.out.println("Input word:");
	while(!w.equals("exit")) {
		System.out.println("Type 'exit' to stop");
		w = scanner.nextLine();
		System.out.println(w);
		}
	scanner.close();
	}
} 