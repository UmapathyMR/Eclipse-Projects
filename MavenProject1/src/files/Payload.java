package files;

import io.restassured.path.json.JsonPath;

public class Payload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String AddPlace() {
		// TODO Auto-generated method stub
		return "{ \r\n" + 
				"\r\n" + 
				"  \"location\": { \r\n" + 
				"\r\n" + 
				"    \"lat\": -38.383494, \r\n" + 
				"\r\n" + 
				"    \"lng\": 33.427362 \r\n" + 
				"\r\n" + 
				"  }, \r\n" + 
				"\r\n" + 
				"  \"accuracy\": 50, \r\n" + 
				"\r\n" + 
				"  \"name\": \"Frontline house\", \r\n" + 
				"\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\", \r\n" + 
				"\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\", \r\n" + 
				"\r\n" + 
				"  \"types\": [ \r\n" + 
				"\r\n" + 
				"    \"shoe park\", \r\n" + 
				"\r\n" + 
				"    \"shop\" \r\n" + 
				"\r\n" + 
				"  ], \r\n" + 
				"\r\n" + 
				"  \"website\": \"http://google.com\", \r\n" + 
				"\r\n" + 
				"  \"language\": \"French-IN\" \r\n" + 
				"\r\n" + 
				"} ";
	}

	
	
	//this is used for dummy complex jason working file
	
	public static String CoursePrice() {
	
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 910,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
	}
}
