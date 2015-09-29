package com.jcs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter {
		// CSv File location 
		static String fileName = System.getProperty("user.home")+"/dev.csv";
		//Delimiter used in CSV file
		private static final String COMMA_DELIMITER = ",";
		private static final String NEW_LINE_SEPARATOR = "\n";
		//CSV file header
		//private static final String FILE_HEADER = "id,name,type,country,Latitude,Longitude,key,fullName,iata_airport_code,locationId,inEurope,countryCode,coreCountry,distance";
		private static final String FILE_HEADER = "Id,Name,Type,Latitude,Longitude";
		public static void writeCsvFile(List<?> data) {
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(fileName);
				//Write the CSV file header
				fileWriter.append(FILE_HEADER.toString());
				//Add a new line separator after the header
				fileWriter.append(NEW_LINE_SEPARATOR);
				//Write a new city object list to the CSV file
			for (int i =0; i< data.size();i++) {
					CityData fildes = (CityData) data.get(i);
					fileWriter.append(fildes.getId());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getName());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getType());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getLatitude());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getLongitude());
					/*fileWriter.append(fildes.getKey());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getFullName());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getIata_airport_code());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getCountry());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getLocationId());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getInEurope());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getCountryCode());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getCoreCountry());
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(fildes.getDistance());	*/
					fileWriter.append(NEW_LINE_SEPARATOR);
			}
			
			System.out.println("CSV file was created successfully at "+System.getProperty("user.home")+"\\dev.csv !!!");
				
			} catch (Exception e) {
				System.out.println("Error in CsvFileWriter !!!");
				e.printStackTrace();
			} finally {	
				try {
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e) {
					System.out.println("Error while flushing/closing fileWriter !!!");
	                e.printStackTrace();
				}
				
			}
		}

	

}
