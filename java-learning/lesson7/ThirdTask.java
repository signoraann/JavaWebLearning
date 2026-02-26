package lesson7;

public class ThirdTask {
	public static int calculateArea(int width, int height) {
		return width*height;
	}
public static void main(String[] args) {
		int area = calculateArea(5, 4);
		System.out.println("Area: " + area);
	}
}