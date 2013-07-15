package naren.sourcecodes;

import java.util.Scanner;

public class Change {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the change value: ");
		int valChange = scanner.nextInt();

		int qtr  = valChange/25;
	
		valChange = valChange - (qtr*25);
		int dimes = valChange/10;
		valChange = valChange - (dimes*10);
		int nickel = valChange/5;
		valChange = valChange - (5*nickel);
		
		System.out.println(qtr+" quater(s)\n"+dimes+" dime(s)\n"+nickel+" nickel(s)\n"+valChange+" penni(es)");
		
	}

}

/*
Sample Output:

Enter the change value: 87
3 quater(s)
1 dime(s)
0 nickel(s)
2 penni(es)
*/
