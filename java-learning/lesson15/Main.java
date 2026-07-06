package lesson15;

public class Main {
  public static void main(String[] args) {
	for (OrderStatus status : OrderStatus.values()) {
	System.out.println(status.getStatusMessage());
	}
  }
}