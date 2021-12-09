package sampleProject;

import java.util.Scanner;

public class UserDefinedException extends Throwable {
//throwable is the superclass for all exceptions
	//the below is a constructor //it is a user defined constructor
	public UserDefinedException(String msg) {
		// TODO Auto-generated constructor stub
		
		super(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while (true) 
		{
			
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 10 char string");
			str = sc.next();
			
			
			try {
				if (str.length()!= 10) {
					throw new UserDefinedException("String should be 10 char long");
				} 
				else 
				{
					System.out.println(str);
					break;
				}
			}
			catch (UserDefinedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			//here finally block gets executed whatever may be the situation
		finally{
			System.out.println("I am finally block");
		}
		}
		
	}
}
