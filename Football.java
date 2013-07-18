package naren.sourcecodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Football {

	public static void main(String[] args) {
		try {
			Integer max = 0;
			Integer min = 0;
			Integer maxGoal = 0;
			Integer minGoal = 0;
			String maxName = "";
			String minName = "";
			String teamName="";
			Scanner scanner = new Scanner(new File("file_Location/football.dat"));

			while (scanner.hasNext()) {

				String string = scanner.nextLine();
				

				Matcher matcherName = Pattern.compile("\\s[aA-zZ]+").matcher(string);
				Matcher forPattern = Pattern.compile("\\d[0-9]\\s+-").matcher(string);
				Matcher againstPattern = Pattern.compile("-\\s+[0-9]+").matcher(string);

				while (matcherName.find()) {

					teamName = matcherName.group().trim();

				}


				while (forPattern.find()) {

					max = new Integer(forPattern.group().replace("-", " ").trim());

				}


				while (againstPattern.find()) {

					min = new Integer(againstPattern.group().replace("-", " ").trim());

				}

				if (maxGoal > (max - min)) {

				} else {
					
					maxGoal = max - min;
					maxName = teamName;
				}

				if (minGoal < (max - min)) {

				} else {
					
					minGoal = max - min;
					minName = teamName;
					
				}

			}

			System.out.println("Maximum Goal scored team:");
			System.out.println(maxName  + ":" + maxGoal + "\n");
			System.out.println("Minimum Goal scored team:");
			System.out.println(minName + ":" + minGoal);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
