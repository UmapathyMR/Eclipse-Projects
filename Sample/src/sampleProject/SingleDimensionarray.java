package sampleProject;

import java.util.Scanner;

public class SingleDimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {10,20,30,40};
		
		for(int i=0;i<a.length;i++)
		
		{
			
			System.out.println("a["+i+"]="+a[i]);
		}
	
		//another method of writing the single dimension array is as follows:
		
		int[] b = new int[4];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		
		//scanner class is used to see and access the data during the run time..here we 
		//are using scanner class to give the array size during the run time and execute the program from there on
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array size=");
			
		int aSize = sc.nextInt();
		
		int []c = new int[aSize];
		
		System.out.println("enter the array elements/objects");
	for(int j=0;j<c.length;j++)
	{
	c[j]	=  sc.nextInt();
	System.out.println("b["+j+"]="+c[j]);
	
	}
	
	
	
	}
	

}
