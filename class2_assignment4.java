// Write a program to print total number of days in the given month.


package Class2_assignments;
import java.util.Scanner;

public class class2_assignment4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month, days;
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter a Month (1 - 12) as (e.g. 1 for January) : ");
		month = scan_in.nextInt();
		
		switch (month)
		{
			case 1 : days = 31;
					 break;
			case 2 : days = 28;
			 		 break;
			case 3 : days = 31;
			 		 break;
			case 4 : days = 30;
					 break;
			case 5 : days = 31;
			 		 break;
			case 6 : days = 30;
			 		 break;
			case 7 : days = 31;
					 break;
			case 8 : days = 31;
			 		 break;
			case 9 : days = 30;
			 		 break;
			case 10 : days = 31;
					 break;
			case 11 : days = 30;
			 		 break;
			case 12 : days = 31;
			 		 break;
			default : days = -1; // invalid case	 		 
		}
		if (days > 0)
			System.out.println("Number of days in month " + month + " are " + days + ".");
		else
			System.out.println("Invalid Month");
		
		if (scan_in != null)
			scan_in.close();
		
	}
}
