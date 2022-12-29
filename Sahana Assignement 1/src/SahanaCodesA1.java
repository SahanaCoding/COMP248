
		//---------------------------------------------------------

		//Assignment 1
		// Written by: (Sakanah Dharmalingam, iD#: 40184267)
		// For COMP 248 Section (W WA) – Winter 2021

		// --------------------------------------------------------

		//Question 1
		import java.util.Scanner;
		public class SahanaCodesA1 {

			

			public static void main(String[] args) {
				Scanner userInput = new Scanner(System.in);
			//1.Display of welcome message
			System.out.println("**************************************");
			System.out.println("Welcome To Password Encryption Program");
			System.out.println("**************************************");
				
			System.out.println();
				
			//2. Ask user's input number
				
			System.out.print("Please enter a 6-digit number: ");
				
			String sixDigitNumber = userInput.next();
			System.out.println();
				
			//3.Store Constant variable 10
			final int c =10;
				 
			System.out.println("Generating the encrypted number...");
			System.out.println();
				
				
				
			//4. Assign variables to each digit and let string be parsed into Integer 	
			int	digitOne= Integer.parseInt(sixDigitNumber.substring(0,1));
			int	digitTwo= Integer.parseInt(sixDigitNumber.substring(1,2));	
			int	digitThree=Integer.parseInt(sixDigitNumber.substring(2,3));	
			int	digitFour= Integer.parseInt(sixDigitNumber.substring(3,4));	
			int	digitFive= Integer.parseInt(sixDigitNumber.substring(4,5));	
			int	digitSix= Integer.parseInt(sixDigitNumber.substring(5,6));
		
			//5. Display of encryption number 	
		    int newDigitTwo= digitTwo%2;
			int newDigitThree= (digitThree+1);
			int newDigitFour= newDigitThree%3;
			
			
			int encrypted = ((((((((digitSix * c)+ newDigitTwo )* c)+newDigitThree )* c)+digitFive) * c)+newDigitFour) * c +digitOne;
			
			
		    //6. Printing output 
			System.out.println("The encrypted 6-digit number is : " +encrypted );
			System.out.println();
			
			//7. Display of farewell message
			System.out.println("Thank you for using Password Encryption Program!");
				
		

		
		
		
		
		
	}

}
