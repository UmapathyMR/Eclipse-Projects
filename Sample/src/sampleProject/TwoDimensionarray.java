package sampleProject;

public class TwoDimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//added block comment from line 9 to line 29... remove the block comment by going to source to see the program execution
		//check to block comment other programs to see the progrma running in the line 9 to 29//
		
		/*int p[][]=
			{
					{1,2,3,4,5},
					{6,7,8,9,10},	
					{11,12,13,14,15},
					
			};
		
		
		for(int i=0;i<3;i++) 
		
		{
			for (int j=0;j<5;j++) {
			
				System.out.print(p[i][j]+"  ");
				
		}
						System.out.println();
		}
					}
	*/
	//if the array size is dynamic and not the same, here we have 1st row 3 objects, 2nd row 5 objects and 3rd row 2 objects
	//now we cannot use the above method and we have to follow some different method to print them
	
		//commenting line 34 to 47 to see further programs
	/*
	 * int g[][]=
	 * 
	 * { {1,2,3}, {4,5,6,7,8}, {9,3},
	 * 
	 * };
	 * 
	 * 
	 * for (int h=0;h<g.length;h++)
	 * 
	 * { for (int k=0;k<g[h].length;k++) { System.out.print(g[h][k]+"  ");
	 * 
	 * } System.out.println(); }
	 */
	//another method of calling the two dimension dynamic array values
	
	int p[][] = 
		{
		{1,2,3,4,5},
		{6,7,10},	
		{11,12},
		
		};
	
	//the below is for each loop and it is used when the size is dynamic; advanced form of for loop
	for (int q[]:p)
	{
		
		for (int l:q)
		{
			System.out.print(l+"  ");
			
		}
	
		System.out.println();
	}
	
	
	
	}
}
	
	
	
		

