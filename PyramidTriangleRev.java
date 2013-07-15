
package naren.sourcecodes;

import java.util.Scanner;

public class PyramidTriangleRev {

	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner scanIn = new Scanner(System.in);
		int n = scanIn.nextInt();
		int i,j;
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= (2 * (n - i)); j++) {
				System.out.print(" ");
			}

			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			for (j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

/*
Sample Output:
Enter the number of lines: 3
     1 
   2 1 2 
 3 2 1 2 3
*/