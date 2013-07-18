package naren.sourcecodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Weather {

	public static void main(String[] args) {
		try {
			Integer max = 0;
			Integer min = 0;
			Integer day = 0;
			Integer minTemp = 100;
			Integer maxTemp = 0;
			Integer minTempDay = 0;
			Integer maxTempDay = 0;
			String line = "";
			String lineRead = "";
			Scanner scanner = new Scanner(new File("file_Location/weather.dat"));

			while (scanner.hasNext()) {

				String string = scanner.nextLine();

				Matcher matcherPattern = Pattern.compile("^[\\s]*[\\d]{1,2}[\\s*]*[\\d]{2}[\\s*]*[\\d]{2}").matcher(string);

				while (matcherPattern.find()) {

					line = matcherPattern.group().trim();

					if (!(line.isEmpty())) {

						lineRead = line.replaceAll("[\\s*]+", " ");
						String[] editedLine = lineRead.split(" ");
						day = Integer.parseInt(editedLine[0]);
						max = Integer.parseInt(editedLine[1]);
						min = Integer.parseInt(editedLine[2]);

						if (maxTemp < (max - min)) {
							maxTemp = max - min;
							maxTempDay = day;
						}

						if (minTemp > (max - min)) {
							minTemp = max - min;
							minTempDay = day;
						}

					}

				}

			}

			System.out.println("Maximum Temperature");
			System.out.println("Day " + maxTempDay + " : Temp " + maxTemp + "°C\n");
			System.out.println("Minimum Temperature");
			System.out.println("Day " + minTempDay + " : Temp " + minTemp + "°C");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}