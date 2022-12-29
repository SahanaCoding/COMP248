import java.util.Arrays;

public class SahanaCodesA3 {

	public static void main(String[] args) {
       
			         //-----------------------------------------------------
			         //Assignment 3
					// Written by: (Sakanah Dharmalingam, iD#: 40184267)
					// For COMP 248 Section (W WA) – Winter 2021

					// ---------------------------------------------------------
	//Question 1
			
		   //1.initializing array A to 10 numbers
			
			int[] A = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			
			//2. 2D array to make matrix
			int[][] B = {{0,0,0},
			             {0,0,0},
			             {0,0,0}};
			
			 B = new int[3][3];

			
			//3. initializing sum of rows,column,diagonals	
		
			int row1=B[0][0]+B[0][1]+B[0][2];
			int row2=B[1][0]+B[1][1]+B[1][2];
			int row3=B[2][0]+B[2][1]+B[2][2];    
			//-------------------------------------
			int column1= B[0][0]+B[1][0]+B[2][0];
			int column2= B[0][1]+B[1][1]+B[2][1];
			int column3= B[0][2]+B[1][2]+B[2][2];
			//----------------------------------------
			int diagonal= B[0][0]+B[1][1]+B[2][2];
			int diagonal2=B[0][2]+B[1][1]+B[2][0];
			//------------------------------------------
			
			//4. Adding boolean values to make all rows columns diagonals equal to each other
		
			boolean rows = ((row1==row2) &&(row2==row3)&& (row1==row3));
			boolean columns=((column1==column2)&&(column2==column3)&& (column1==column3));
			boolean diagonals = ((diagonal==diagonal2));
				
			//-----------------------------------------------
		 //Display of do while loop in order to make sure all rows columns diagonals are equal
			
			//Print output
			System.out.print("The randomly generated matrix is: ");
			
			
		 //Display of a nested for loop
			
		do {
			//display of outer for loop to go through each array into positions 0,1,2
			for(int i=0;i<3;i++)
				{
				  for(int j=0;j<3;j++)
				  {
				 //display of variable rNumber such that output results with a number from 1-9  
				   int rNumber;
				   rNumber = (int)(Math.random()*9)+1;
				   while(A[rNumber] !=0)
				   {
				       rNumber = (int)(Math.random()*9)+1;
				   }
				   //Storing in such array in order to make numbers not repeat
				   B[i][j]= rNumber;
				   A[rNumber]=1;
				  
					}
				}
				// display of for loop to print the matrix
				for(int i=0;i<3;i++)
				{
					System.out.println();
				    for(int j=0;j<3;j++)
				    {
				       	System.out.print(B[i][j]+" ");
				       
				    }
				}
		
		//apply condition of equivalence in a do- while loop
			} while  (rows == columns == diagonals);
		
		//Note****    
		//sorry sir I tried debugging as you mentioned , yet was not able to pick up the error
		}
		}
		
