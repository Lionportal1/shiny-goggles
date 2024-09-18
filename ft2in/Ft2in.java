package ft2in;

import java.util.Scanner;

public class Ft2in 
{
	//Global Variables
	public static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Local Variables
		double ft = 0.0;
		double in = 0.0;
		
		int choice = 0;
		
		
		
		System.out.println("Convert Feet and Inches");
		System.out.println("***********************");
		System.out.println("   1. Feet to Inches");
		System.out.println("   2. Inches to Feet");
		System.out.println("   3. Quit");
		System.out.println("***********************");
		System.out.print("   Choice: ");
		
		choice = s.nextInt();
		
		if(choice == 1)
		{
			System.out.print("\n\nEnter number of feet to convert: ");
			ft = s.nextDouble();
			in = ft2in(ft);
			System.out.printf("%1.4f feet = %1.4f inches\n",ft,in);
		}
		else if (choice ==2)
		{
			System.out.print("\n\nEnter number of inches to convert: ");
			in = s.nextDouble();
			ft = in2ft(in);
			System.out.printf("%1.4f feet = %1.4f inches\n",ft,in);
		}
		else if (choice ==3)
		{
			System.out.println("Goodbye");
		}
		else
		{
			System.out.println("Yo Stupid - I said 1,2, or 3");
		}
		s.close();
		System.out.println("\n    Goodbye");
	}

	public static double ft2in(double ft)
	{
		double in = ft * 12;
		return in;
	}
	
	public static double in2ft(double in)
	{
		double ft = in/12;
		return ft;
	}
}
