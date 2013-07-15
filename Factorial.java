/* Write a program to find the factorial value of any number entered through keyboard. */

package naren.sourcecodes;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int i,fact=1;
		System.out.print("Enter a number: ");
		Scanner scanIn = new Scanner(System.in);
		Integer num = scanIn.nextInt();
		for(i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is " + fact);
	}
}
