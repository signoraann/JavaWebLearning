package lesson15;

public enum OrderStatus {
	PENDING("Your order is being prepared"),
	SHIPPED("Your order is on the way!"),
	DELIVERED("Your order has arrived"),
	PROCESSING("Your order being prepared"), 
	OUT_FOR_DELIVERY("Your order out for delivery"), 
	CANCELLED("Your order cancelled"),
	RETURNED("Your order returned"), 
	REFUNDED("Your payment refunded"),
	CONFIRMED("Your order has been confirmed");

	private final String message;

	OrderStatus(String message) {
		this.message = message;
	}

	public String getStatusMessage() {
		return message;
	}
}