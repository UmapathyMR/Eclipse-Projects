package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Payload;



public class Basics {

	public static void main(String[] args) {
		

		RestAssured.baseURI= "https://rahulshettyacademy.com";
		//given - input all details
		//when - submit the APi
		//Then - validate the Response
		
		String response = given().log().all().queryParam("key", "qaclick123").header("ContentType.Text", "application/jason")
		.body(Payload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		
		//adding few more validations from the body and from the header..so 
		//example validating the  scope from the body and server validating from the header within the response
		
		.body("scope",equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response); //for parsing Json
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		
		//now we have printed the place id obtained from the response of the AddPlace method and also we have 
		//saved that place id under a object called placeId... so, now we can re use it while performing the GetPlace Api method
		
	
		//below is the UpdatePlace API by adding some new address
		
		
		String newAddress = "Summer Walk USA";
		
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("\r\n" + 
				"{ \"place_id\": \""+placeId+"\",\r\n" + 
				"\"address\": \""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//below is GetPlace API
		
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(getPlaceResponse);
		
		JsonPath js1 = ReUsableMethods.rawtoJason(getPlaceResponse);
		//JsonPath js1 = new JsonPath(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(newAddress, actualAddress);
	
		
		//restassured has built in assertion methods (means the validation methods like body("msg", equalTo("Address successfully updated"))
		//but we can use this only when we are inside the given().when().then() chain... when we are out of that chain
		//we can no longer use the assertion method supported by rest assured and we have to rely on 
		//java based assertion method// java in itself doesnt has any assertion method//so we rely on 
		//testNg frameworks which has assertion methods
		//download testNg framework from mvn repository
		
		
		
	}

}
