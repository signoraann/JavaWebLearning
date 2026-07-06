package lesson15;

public enum Size {
  	SMALL(5.0), MEDIUM(10.0), LARGE(15.0);

	private final double price;

	Size(double price) {
		this.price = price;
   	}

	public double getPrice() {
		return price;
	}
}