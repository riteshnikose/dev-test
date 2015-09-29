package com.jcs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Parser {
			public Parser(String city) {
				String apkLocation =  "http://api.goeuro.com/api/v2/position/suggest/en/"+city;				
				try {
					//	URL url = new URL("http://api.goeuro.com/api/v2/position/suggest/en/Berlin");
						URL url = new URL(apkLocation);
						BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
						JSONParser jsonParser = new JSONParser();
						String strTemp = "";
						int i = 0;
						List<CityData> students = new ArrayList<CityData>();
						while (null != (strTemp = br.readLine())) {
								JSONArray jsonObject = (JSONArray) jsonParser.parse(strTemp);
								while(i<jsonObject.size()){
										JSONObject jsonObject1 = (JSONObject) jsonParser.parse(jsonObject.get(i).toString());
										long _id =  (long) jsonObject1.get("_id");
										String name = (String) jsonObject1.get("name");
										String type = (String) jsonObject1.get("type");
										JSONObject geo_positionObject = (JSONObject) jsonObject1.get("geo_position");
										String longitude = String.valueOf( geo_positionObject.get("longitude"));
										String latitude = String.valueOf( geo_positionObject.get("latitude"));
										//String fullName = (String) jsonObject1.get("fullName");
										//String iata_airport_code = (String) jsonObject1.get("iata_airport_code");
										//String country = (String) jsonObject1.get("country");
										//String key = (String) jsonObject1.get("key");
										//String locationId = String.valueOf(jsonObject1.get("locationId"));
										//boolean inEurope = (boolean) jsonObject1.get("inEurope");
										//String countryCode = (String) jsonObject1.get("countryCode");
										//boolean coreCountry = (boolean) jsonObject1.get("coreCountry");
										//String distance = (String) jsonObject1.get("distance");							
										//System.out.println("firstName"+_id);
										CityData data = new CityData( 
												_id,
												name,
												type, 
												latitude,
												longitude 
												/*key,
												fullName,
												iata_airport_code, 
												country, 
												locationId,
												inEurope, 
												countryCode, 
												coreCountry,
												distance*/
												);
										
										students.add(data);
										i++;
								}
								
								//System.out.println(strTemp);
								CsvFileWriter.writeCsvFile(students);
							}
					} 
					catch (Exception ex) {
						System.out.println("please check Internet Contection");
						ex.printStackTrace();
					}
			}

	
	}