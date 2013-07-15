/* Write a program to check whether a number is a prime or not. */

package naren.sourcecodes;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		System.out.print("Enter a number: ");
		Scanner scanIn = new Scanner(System.in);
		Integer num = scanIn.nextInt();
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a Prime Number");
				flag = 1;
				break;
			}
		}
		
		if (flag == 0 && num == 0 || num == 1)
			System.out.println(num + " is not a Prime Number");
		else if (flag == 0 && num != 0 || num !=1)
			System.out.println(num + " is a Prime Number");
	}
}
