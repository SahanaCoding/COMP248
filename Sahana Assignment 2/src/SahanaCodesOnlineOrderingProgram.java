import java.util.Scanner;
public class SahanaCodesOnlineOrderingProgram {

	//Display of welcome message & menu options
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("    Welcome To Online Ordering Program!");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
// Use of for loop in order to display menu vertically
		String[] Menu = { "  1. Hamburger", "  2 .Pizza", "  3. Noodle", "  4. Salad", "  5. Sandwich", "  6. Exit" };
		for (int i = 0; i < Menu.length; i++) {
			System.out.println(Menu[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		repeatQuestion(0.0);

	}//Addition of new method in order to repeat question later

	public static void repeatQuestion(double previousTot) {

		// Question 2

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your choice (1-6): ");
		String order;
		int choice;
		choice = in.nextInt();
		System.out.println();
		switch (choice) {
//Use of switch case statement in order to match user input
		case 1:
			order = "Hamburger";
			break;

		case 2:
			order = "Pizza";
			break;

		case 3:
			order = "Noodle";
			break;
		case 4:
			order = "Salad";
			break;
		case 5:
			order = "Sandwich";
			break;

		default:
			order = "Finish the order!";

			break;
		}
		
        //Initializing of variables and price
		Double delivery = 5.00;
		Double totalAmount = previousTot;
		Double Beef = 25.5;
		Double Pork = 17.5;
		Double noMeat = 7.5;
        //if and  else statements in order meet certain conditions
		if (choice < 7 && choice > 0) {

			System.out.println("Your choice is: " + order + ".");
			System.out.println();

		}

		else {//error message for wrong user input
			System.out.print("That is a wrong input. Please try again!");
			System.out.println();
			repeatQuestion(previousTot);

			return;
		}

		if (order == "Finish the order!") {
            //Ask user for tips and display total amount if order is finished
			if (previousTot < 50.00 && previousTot > 0.00) {
				System.out.print("The total price is less than $50. You need to pay the delivery fee 5$");
				System.out.println();
				System.out.print("Would you like to pay some tips? Please enter the amount?: ");
				Double tips = in.nextDouble();
				System.out.println();
				System.out.print("The total price is " + (previousTot + delivery + tips));
				System.out.println();
			} else if (previousTot >= 50.00) {
				System.out.print("No need to pay the delivery fee.");
				System.out.println();
				System.out.print("Would you like to pay some tips? Please enter the amount?: ");
				Double tips = in.nextDouble();
				System.out.println();
				System.out.print("The total price is " + (previousTot + tips));
				System.out.println();
			} else {//I have added spaces here to display message exactly like the samples provided
				System.out.print("No need to pay the delivery fee.");
				System.out.println();
				System.out.print("The total price is " + (previousTot));
				System.out.println();

			}
            //Display of closing message
			System.out.println();
			System.out.print("Thank you for using Online Order Program!");
			System.out.println();

			return;
		}
        //Ask user if they want meat on their food
		System.out.print("Would you like to have some meat on your " + order + " ?");
		String Meat = in.next();
		// Display possible meat options
		String moreFood;
		if (Meat.equalsIgnoreCase("YES")) {
			System.out.print("Beef or Pork ?");
			String MeatChoice = in.next();
			MeatChoice = MeatChoice.toUpperCase();

			if (MeatChoice.equals("BEEF")) {
				totalAmount += Beef;

			} else if
             //Use of if else statements to match user input and display appropriate costs
			(MeatChoice.equals("PORK")) {
				totalAmount += Pork;
			} else {
				totalAmount += noMeat;
			}
		}

		// Ask user if they want more food

		System.out.print("Would you like to have more food ? ");
		String moreFood1 = in.next();
		System.out.println();
		// If User wants more food repeat questions and all possible cases and costs
		if (moreFood1.equalsIgnoreCase("YES")) {
			System.out.println();
			repeatQuestion(totalAmount);
			return;
		}//Display raneg of which user has to pay for delivery fees
		if (totalAmount < 50.00 && totalAmount > 0.00) {
			System.out.print("The total price is less than $50. You need to pay the delivery fee 5$");
			System.out.println();
			totalAmount += delivery;
		} else if (totalAmount >= 50.00) {
			System.out.print("No need to pay the delivery fee.");
			System.out.println();
		}
		// Asking user for tips
		System.out.print("Would you like to pay some tips? Please enter the amount?: ");
		Double tips = in.nextDouble();
		System.out.println();
		System.out.print("The total price is " + (totalAmount + tips));
		System.out.println();

		System.out.println();
		System.out.print("Thank You for using Online Order Program!");

	}

}
