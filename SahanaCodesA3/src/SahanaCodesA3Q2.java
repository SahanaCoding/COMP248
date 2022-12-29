import java.util.Scanner;
public class SahanaCodesA3Q2 {

	//-----------------------------------------------------
    //Assignment 3
	// Written by: (Sakanah Dharmalingam, iD#: 40184267)
	// For COMP 248 Section (W WA) – Winter 2021
    //Question2
	// ---------------------------------------------------------
	public static void main(String[] args) {
		//import scanner to read user input
		Scanner in = new Scanner(System.in);	
System.out.println("Please input pixel values : ");
   int [] values= new int [10]; //displaying length of values as 10 using arrays
for (int i=1; i<=10; i++ )
{
	//Apply for loop to output pixels
	System.out.print("pixel" + " " + i + " = " );
    int pixels=in.nextInt();
 

//initialized variable of Quantisized pixel
    int Quantisized= 0;
//if/else statements to match quantisized number according to its' interval
	if (pixels>=0 && pixels<=20)
	{
		Quantisized=10;
	}
	
	else if (pixels>=21 && pixels<=40)
	{
		Quantisized=30;
	}
	
	else if (pixels>=41 && pixels<=60)
	{
		Quantisized=50;
	}
	else if (pixels>=61 && pixels<=80)
	{
		Quantisized=70;
	}
	else if (pixels>=81 && pixels<=100)
	{
		Quantisized=90;
	}
	else if (pixels>=101 && pixels<=120)
	{
		Quantisized=110;
	}
	else if (pixels>=121 && pixels<=140)
	{
		Quantisized=130;
	}
	else if (pixels>=141 && pixels<=160)
	{
		Quantisized=150;
	}
	else if (pixels>=161 && pixels<=180)
	{
		Quantisized=170;
	}
	else if (pixels>180)
	{
		Quantisized=190;
	}
 
 values[i-1]= Quantisized;
}
System.out.print("Quantisized pixel values :" );
for (int j = 0; j < values.length; j++)

{
	System.out.print(values[j]+" ");
}


 System.out.println();

}
}
