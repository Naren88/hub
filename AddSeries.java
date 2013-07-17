/* Write a program to evaluate the series 1 + 1/3 + 1/5 + 1/7 + .... up to 15 terms */

package naren.sourcecodes;

public class AddSeries {

	public static void main(String[] args) {
		double i, res = 0;
		System.out.print("The sum of 1");
		for (i = 1; i <= 15;) {
			res = res + (1 / i);
			System.out.print(" + 1/" + (int)i);
			i = i + 2;
		}
		System.out.print(" is " + res);
	}

}

/*

The output will be as:

The sum of 1 + 1/1 + 1/3 + 1/5 + 1/7 + 1/9 + 1/11 + 1/13 + 1/15 is 2.0218004218004215

*/