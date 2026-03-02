package lesson7;

public class TaskThree {
	public static void main(String[] args) {
		long area = calculateArea(5, 4);
		System.out.println("Area: " + area);
	}
	
	public static long calculateArea(int width, int height) {
		return width*height;
	}
}