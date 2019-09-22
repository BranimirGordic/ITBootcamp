package domaci_Kalkulator;

public class GlavniProgram_kalkulatora {
	
	public static void main(String[] args) {

		Kalkulator_09_12_2019 calc=new Kalkulator_09_12_2019();
		double rezultat= calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
		System.out.println(rezultat);
		
		//double result= calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
		//System.out.println(result);

		
		
	}

}
