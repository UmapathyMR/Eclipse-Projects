package sampleProject;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int nr, dr, result;
		
			
		
		
			while (true) {
				
				System.out.println("enter the nr value");
				nr = sc.nextInt();
				System.out.println("enter the dr value");
				dr = sc.nextInt();
					
				
				
				try {
					result = nr / dr;
					System.out.println(result);

					break;//giving break key word to stop the program further running

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			} 
			
				}	
		
		//result = nr/dr;
		//System.out.println(result);	
		//the above two lines were selected and right clicked and 
		//choose the surrounds with and select try catch block so we
		//will get the above expression
	
}


