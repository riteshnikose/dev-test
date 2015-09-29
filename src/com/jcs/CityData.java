package com.jcs;

public class CityData {
	private String id;
	private String key;
	private String name;
	private String fullName;
	private String iata_airport_code;
	private String type;
	private String country;
	private String latitude;
	private String longitude;
	private String locationId;
	private String inEurope;
	private String countryCode;
	private String coreCountry;
	private String distance;
	
	

	public CityData(long id, String name, String type, String latitude, String longitude
			/*String country, 
			String iata_airport_code,
			String fullName,
			String key,
			String locationId, 
			boolean inEurope, 
			String countryCode, 
			boolean coreCountry, 
			String distance*/) {
		
			 super();
			 this.setId(String.valueOf(id));
			 this.setName(name);
			 this.setType(type);
			 this.setLatitude(latitude);
			 this.setLongitude(longitude);
			/* this.setKey(key);
			 this.setFullName(fullName);
			 this.setIata_airport_code(iata_airport_code);
			 this.setCountry(country);
			 this.setLocationId(locationId);
			 this.setInEurope(String.valueOf(inEurope));
			 this.setCountryCode(countryCode);
			 this.setCoreCountry(String.valueOf(coreCountry));
			 this.setDistance(distance);*/
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIata_airport_code() {
		return iata_airport_code;
	}
	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getInEurope() {
		return inEurope;
	}
	public void setInEurope(String inEurope) {
		this.inEurope = inEurope;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCoreCountry() {
		return coreCountry;
	}
	public void setCoreCountry(String coreCountry) {
		this.coreCountry = coreCountry;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

}
