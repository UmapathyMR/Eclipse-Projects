package sampleProject;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Umapathy";
		System.out.println(name);
		System.out.println(name.length());//gives the length of string
		System.out.println(name.charAt(0));//prints the 0th index of the string "umapathy"
		System.out.println(name.indexOf("m"));//prints the index of letter m in the string
		
		
		 String name1 =  new String("umapathy");
		 System.out.println(name1);
		 
		 System.out.println(name.equals(name1));
		 System.out.println(name.equalsIgnoreCase(name1));
		 System.out.println(name.contains(name1));
		 
		 System.out.println(name.toLowerCase());
		 System.out.println(name.toUpperCase());
		 System.out.println(name1.contains(name.toLowerCase()));
	
	String n = new String ("  umapathy");
	System.out.println(n);
	
	//here we are using trim key word to overcome the gap before the words//very much
	//used to check the words example the column heading in the excel while we check our data
	
	System.out.println(name1.equals(n.trim()));
	System.out.println(name1.equals(n));
	
	String n2 = new String ("Uma Pathy MR");
	 String[] str = n2.split("  "); //using split method
			
			for(String m:str) //getting str value and storing into one variable m of type String type
			{
	System.out.println(m);
	
	}
	
	}
}
