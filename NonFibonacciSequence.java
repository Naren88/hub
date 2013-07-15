/* Write a program to print all numbers less than 100 and NOT appearing in Fibonacci sequence. The sequence will start as
4, 6, 7, 9, 10, 11, 12, .... */

package naren.sourcecodes;

public class NonFibonacciSequence {

	public static void main(String[] args) {

		int i = 1;
		int j = 2;
		int k = 0;
		int l = 0;

		System.out.println("Non-Fibonacci Sequence ranges less than 100 :");

		int n = 100;
		while (k <= n) {
			k = i + j;
			i = j;
			j = k;
			l = i + j;

			for (int x = k + 1; x < l; x++) {
				if (x < n)
					System.out.println(x);
				else
					break;
			}
		}

	}

}
