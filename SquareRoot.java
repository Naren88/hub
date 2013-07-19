package naren.sourcecodes;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		double squareRoot = Math.sqrt(n);
		System.out.println("The math class square root is: " + squareRoot);

	}
}
