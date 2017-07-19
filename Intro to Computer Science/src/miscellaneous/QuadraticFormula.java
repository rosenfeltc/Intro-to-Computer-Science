package miscellaneous;

import java.lang.Math;

public class QuadraticFormula {

	public static void quadraticFormula (double a, double b, double c){
		
		double discriminant = b * b - 4 * a * c;
		if (discriminant < 0)
		{
			System.out.println("I cannot compute the answer when the discriminant is negative, please try with different numbers!");
			return;
		}
		double discriminantSquared = Math.sqrt(discriminant);
		double denominator = 2 * a;
		double nominator1 = - b + discriminantSquared;
		double nominator2 = - b - discriminantSquared;
		double result1 = nominator1 / denominator;
		double result2 = nominator2 / denominator;
		
		System.out.println("x = " + result1 +" , " + result2);
	}
	public static void main(String[] args) {
	
		quadraticFormula(8, 13, 35);
	
	}

}
