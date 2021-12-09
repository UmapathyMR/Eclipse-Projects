package sampleRestAssured;

import io.restassured.RestAssured;

public class RestAssured1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam()
		
		
	}

}
