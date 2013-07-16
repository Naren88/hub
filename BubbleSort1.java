package naren.sourcecodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort1 {
	public static void main(String[] args) throws IOException {
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of persons: ");
		int num = Integer.parseInt(dis.readLine());
		String s[] = new String[num];
		int i,j;
		System.out.println("Enter " + num + " person names: ");
		for(i=0;i<num;i++)
			s[i] = dis.readLine();
		String ts = new String();
		for(i=1;i<num;i++)
		{
			for(j=0;j<num-i;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					ts = s[j];
					s[j] = s[j+1];
					s[j+1] = ts;
				}
			}
		}
		System.out.println("The given names in Alphabetical order using Bubble Sort: ");
		for(i=0;i<num;i++)
			System.out.println(s[i]);
		
	}

}
