package restAssured;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {

	public static JsonPath rawtoJason(String response) {
		
		JsonPath js1 = new JsonPath (response);
		return js1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
