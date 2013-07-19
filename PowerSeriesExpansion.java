package naren.sourcecodes;

import java.util.Scanner;

public class PowerSeriesExpansion {
	public static void main(String[] args) {
		System.out.println("ln(x) Value" + Math.log10(2));
		double e = Math.E;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x value to find e^x result : ");
		double x = scanner.nextDouble();
		System.out.println("The value of e is " + e);
		System.out.println("The value of " + e + "^" + x+ " : " + Math.pow(e, x));

	}

}
