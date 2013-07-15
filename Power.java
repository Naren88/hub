/* Two numbers are entered through the keyboard. Write the program to find the value of one number raised to the power of another. */

package naren.sourcecodes;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		System.out.print("Enter x value: ");
		Integer x = scanIn.nextInt();
		System.out.print("Enter y value: ");
		Integer N = scanIn.nextInt();
		Integer result = x;
		if (x != 0 && N == 0)
			System.out.println("The x^N i.e., " + x + "^" + N +" result is: 1");
		else {
			for (int i = 1; i < N ; i++) {
				result = result * x;
			}
			System.out.println("The x^N i.e., " + x + "^" + N +" result is: " + result);
		}
	}
}