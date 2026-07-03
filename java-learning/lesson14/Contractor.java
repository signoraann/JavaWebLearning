package lesson14;

public class Contractor implements Payable {
	private double workRate;
	
	public Contractor( double workRate) {
		this.workRate = workRate;
	}

	@Override
	public double calculatePay(double workHours) {
		return workHours*workRate;
	}

}