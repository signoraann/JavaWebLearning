package lesson15;

public class MainSize {
   public static void main(String[] args) {
	for(Size size : Size.values()) {
	     System.out.println(size + " " + size.getPrice());
	}
  }
}