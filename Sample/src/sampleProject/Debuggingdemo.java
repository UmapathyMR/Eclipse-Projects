package sampleProject;

import java.util.Scanner;

public class Debuggingdemo {

	public int m1()
	
	{
	//fgdfg
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:=   ");
		int aSize = sc.nextInt();
		//this is commented
		int a[] = new int[aSize];
		int sum= 0;
		
		System.out.println("Enter the Array Elements");
		for(int i=1;i<a.length;i++)
			
		{
		
		a[i] = sc.nextInt();
		System.out.println("a["+i+"]="+a[i]);
		sum = sum+a[i];
		
				}
		
		System.out.println("Sum of the Array is = " + sum);
		return sum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Debuggingdemo obj = new Debuggingdemo();
		int count = obj.m1();
		System.out.println("Sum of the Array in outside = "+ count);
		
	}

}
