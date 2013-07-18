/*

    Enter the number of lines: 5
          1
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5

*/



package naren.sourcecodes;

import java.util.Scanner;

public class PyramidEquilateral {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		Integer n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >= 0; j--)
				System.out.print(" ");
			for (int k = i; k >= 1; k--)
				System.out.print(" " + i);
				System.out.println();
		}
	}
}