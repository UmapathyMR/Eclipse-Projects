package restAssured;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class NestedJason {

	public static JsonPath main(String[] args) {
		// TODO Auto-generated method stub

		
		
JsonPath js2 = new JsonPath(Payload.CoursePrice());
return js2;
	}

	
	//1. Print No of courses returned by API 
//2.Print Purchase Amount 
//3. Print Title of the first course 
//4. Print All course titles and their respective Prices 
//5. Print no of copies sold by RPA Course 
//6. Verify if Sum of all Course prices matches with Purchase Amount 

 
	
	
	
}
