package lesson15;

public class Main {
  public static void main(String[] args) {
	OrderStatus status = OrderStatus.DELIVERED;
	OrderStatus.getStatusMessage(status);

	OrderStatus status1 = OrderStatus.SHIPPED;
	OrderStatus.getStatusMessage(status1);

	OrderStatus status2 = OrderStatus.PENDING;
	OrderStatus.getStatusMessage(status2);
  }
}