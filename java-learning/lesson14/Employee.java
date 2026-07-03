package lesson14;

public class Employee implements Payable {
 	private double workRate;
	private double deduction;

	public Employee ( double workRate, double deduction) {
		this.workRate = workRate;
		this.deduction = deduction;
	}

	@Override
	public double calculatePay(double workHours) {
		return workHours*workRate-deduction;
	}
}