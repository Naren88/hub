package naren.sourcecodes;

import java.util.Scanner;

public class Pyramid {

	public static void main(String args[]) {
		int i, j, n;
		System.out.print("Enter the number of lines:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println("");
		}
		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j <= i; j++)
				System.out.print("" + j);
			System.out.println("");
		}
	}

}
