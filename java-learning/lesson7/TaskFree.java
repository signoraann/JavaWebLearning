package lesson7;

public class TaskFree {
	public static void main(String[] args) {
		long area = calculateArea(5, 4);
		System.out.println("Area: " + area);
	}
	
	public static long calculateArea(long width, long height) {
		return width*height;
	}
}