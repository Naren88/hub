/* Find the numbers between 1 and 999 for which the sum of cubes of the digits equals the number, for example, 371 (27 + 343 + 1 = 371) */

package naren.sourcecodes;

//import java.util.Scanner;

public class SumOfCubeOfDigitEqualsNumber {
	
	public static void main(String[] args) {
		int n1 = 1, n2 = 999, i, count, sum, rem; 
		/*
			Scanner in = new Scanner(System.in);
        	System.out.print("Enter min limit: ");
        	n1 = in.nextInt();
        	System.out.print("Enter max limit: ");
        	n2 = in.nextInt();
        */
        System.out.println("The sum of cubes of the digits equals the numbers between " + n1 + " and " + n2 + " are "); 
		for(i = n1; i < n2; i++) 
		{ 
			count = i;
			sum = 0; 
			while(count != 0) 
			{ 
				rem = count % 10; 
				sum = sum + rem * rem * rem; 
				count = count / 10; 
			} 
			if(i == sum) 
			{ 
				System.out.println(" " + i); 
			} 
		} 
	}

}

/*
The output will be as:

The sum of cubes of the digits equals the numbers between 1 and 999 are 
 1
 153
 370
 371
 407
*/