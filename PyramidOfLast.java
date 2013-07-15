/* Write a program, given an integer n as input, generates a pyramid of n lines using the last digit of the line number(starting from 1).
The output for n=7 is shown below as 
1
222
33333
4444444
555555555
66666666666
7777777777777

*/

package naren.sourcecodes;

import java.util.Scanner;

public class PyramidOfLast {
	public static void main(String[] args) {
		int i,j;
		System.out.print("Enter the number of lines:");
		Scanner scanIn = new Scanner(System.in);
		Integer n = scanIn.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++)
				System.out.print(i);
			for (j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println("");
		}

	}

}
