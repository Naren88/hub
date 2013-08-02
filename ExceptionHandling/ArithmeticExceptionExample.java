package naren.sourcecodes;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	
	public static void main(String[] args) {
		try {
			int a;
			Scanner in = new Scanner(System.in);
			System.out.print("x = ");
			Integer x = in.nextInt();
			System.out.print("y = ");
			Integer y = in.nextInt();
			a = x / y;
			System.out.println("\na = " + a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
