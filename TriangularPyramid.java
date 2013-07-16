package naren.sourcecodes;

import java.util.Scanner;

public class TriangularPyramid {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i, j;
		for (i = 1; i < n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		for (int k = n; k >= 0; k--) {
			for (j = 1; j <= k; j++)
				System.out.print(j);
			System.out.println();
		}
	}
}

/*
Sample Output: 

Enter the number of lines: 5
1
12
123
1234
12345
1234
123
12
1

*/