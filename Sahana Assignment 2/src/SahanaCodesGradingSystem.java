        //---------------------------------------------------------

		//Assignment 2
		// Written by: (Sakanah Dharmalingam, iD#: 40184267)
		// For COMP 248 Section (W WA) – Winter 2021

		// ---------------------------------------------------------
		// Question 1
        import java.util.Scanner;

		public class SahanaCodesGradingSystem {

			public static void main(String[] args) {

				//Display of welcome message
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("  Welcome To Grading Sytem Program!");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
				repeatQuestions("");

			}
            //Addition of method to repeat question
			public static void repeatQuestions(String previousQuestion) {

				Scanner in = new Scanner(System.in);
				String name = "";
            //Do while loop and substrings in order to make sure user inputs a comma as separation of last name and first name
				do {

					System.out.print("Please enter your name (Last name, First name seperated by a comma: ");
					name = in.next();
				} while (name.indexOf(",") == 0 || (name.indexOf(",") == -1 || name.indexOf(",") == name.length() - 1));

				int pos = name.indexOf(",");
				String lastName = name.substring(0, pos).trim();
				String firstName = name.substring(pos + 1).trim();

				System.out.println();
            //Use of while loop in order to display correct input
				boolean correctInput = false;
				String ID = "";

				while (!correctInput) {
					System.out.print("Please enter your ID without any spaces (7 digits): ");

					ID = in.next();
					System.out.println();
					correctInput = (ID.length() == 7);
				}
				int ID2 = Integer.parseInt(ID);
          // Use of booleans to differentiate what displays for certain input
				boolean correctScore = false;
				double trueDouble=0.0;
				while (!correctScore)

				{
					System.out.print("Please enter your score (0-100): ");

					Double score = in.nextDouble();
					Double SCORE = 0.0;
					SCORE = score;

					System.out.println();
         //Display of user's name and the appropriate score 
					correctScore = (score >= 0 && score <= 100);
                  	if(correctScore)
                  		trueDouble=SCORE;
					System.out.print("" + firstName + "," + lastName + " got " + SCORE + ".");
					System.out.println();
				}//Use of if else statements to display appropriate letter for each score range
                
				
				String X;
				String message;

				if (trueDouble >= 80) {
					message = "Congratulations!";
					X = "A";
				} else if (trueDouble >= 70) {
					message = "You are so close to A!";
					X = "B";
				} else if (trueDouble >= 60) {
					message = "You can do better by more practice!";
					X = "C";
				} else {
					message = " Please work harder to pass the course! ";
					X = "FNS";
				}

				System.out.println();
				String Note = ("Based on the grading system," + firstName + " (" + ID2 + ") " + "will probably get a "
						+ X + "!" + message);
				System.out.println(Note);

				System.out.println();
				System.out.print("Exit the program? Enter yes to exit: ");
				String ans = in.next();

				ans = ans.toUpperCase();
				System.out.println();
				boolean isEqual = ans.equals("YES");

				if (isEqual) {
                //Display of farewell message
					System.out.println("Thank you for using Grading System program!");

				} else {
					repeatQuestions(previousQuestion);
				}

			}

		}

		  