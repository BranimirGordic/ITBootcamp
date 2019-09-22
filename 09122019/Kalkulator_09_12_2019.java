package domaci_Kalkulator;
// Napisati klasu Calculator koja omogucava korisniku da izvrsava sledeci kod:

// Calculator calc=new Calculator();
// double result= calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
// System.out.println(result);

public class Kalkulator_09_12_2019 {

	private static double total = 0;

	public Kalkulator_09_12_2019 add(double x) {
		total += x;
		return this;
	}

	public Kalkulator_09_12_2019 sub(double x) {
		total -= x;
		return this;
	}

	public Kalkulator_09_12_2019 mul(double x) {
		total *= x;
		return this;
	}

	public Kalkulator_09_12_2019 div(double x) {
		total /= x;
		return this;
	}

	public double value() {
		return total;
	}

}
