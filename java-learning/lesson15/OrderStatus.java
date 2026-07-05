package lesson15;

public enum OrderStatus {
	PENDING, SHIPPED, DELIVERED;

	public static void getStatusMessage(OrderStatus status) {
	
	        switch (status) {
		case PENDING -> System.out.println("Your order is being prepared");
		case SHIPPED -> System.out.println("Your order is on the way!");
		case DELIVERED -> System.out.println("Your order has arrived");
	        }
	}
}