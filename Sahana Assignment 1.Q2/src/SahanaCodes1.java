
	//Assignment 1

	//Question 2
	import java.util.Scanner;
	public class SahanaCodes1 {

				public static void main(String[] args) {
					Scanner in = new Scanner(System.in);
					int coffee=0;
					int burger=0;
					int fries=0;
					
					
					System.out.print("How many cups of coffee? ");
					coffee=in.nextInt();
					System.out.println();
					System.out.print("How many burgers? ");
					burger=in.nextInt();
					System.out.println();
					System.out.print("How many fries? ");
					fries=in.nextInt();
					
					if ( coffee==0 || burger==0 || fries==0 ||coffee==0 && burger==0 && fries==0)
					{
						System.out.println();
						System.out.print("No trio combos from this order!");
					}
					
					 if(coffee==0 && burger!=0 && fries!=0)
					{
						System.out.println("Only burger combos from this order!");
					}
					
					else if  (coffee!=0 && (burger==0) && (fries!=0|| fries==0))
					{
						System.out.print("No burger combos from this order!");
					}
					
					else if (coffee!=0 && burger!=0||burger==0 && fries!=0)
					{
						System.out.print("This order contains some trio combos and some burger combos!");
					}
					
					
					else if (coffee!=0 && burger!=0 && fries!=0)
					{
						System.out.print("Only trio combos from this order!");
					}
					
			
		}

	}



