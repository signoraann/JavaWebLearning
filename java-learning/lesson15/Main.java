package lesson15;

public class Main {
  public static void main(String[] args) {
	OrderStatus status = OrderStatus.DELIVERED;
	System.out.println(status.getStatusMessage());

	OrderStatus status1 = OrderStatus.SHIPPED;
	System.out.println(status1.getStatusMessage());

	OrderStatus status2 = OrderStatus.PENDING;
	System.out.println(status2.getStatusMessage());
  }
}