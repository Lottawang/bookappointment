package bookappointmentapp;

import java.util.Scanner;

/**
 * 
 * @author Danfeng Wang
 * @student ID: 104489084
 * @Version: 10/03/2016
 */

public class CappointmentApp {
	

	static String s;
//------------------- to show the menu	
	public static void showmenu()
	{
		 System.out.println("");
		 System.out.println("********************************************************");
		 System.out.println("------------My Appointment Book Application------------");
		 System.out.println("********************************************************");
		 System.out.println("");
		 System.out.println("---Here are some options:");
		 System.out.println("");
		 System.out.println("1. Create a new appointment");
		 System.out.println("2. Display all appointments (in order)");
		 System.out.println("3. Delete an appointment");
		 System.out.println("4. Exit");
		 System.out.println("");
		 System.out.print("----Please make your choice (for example: 1):");
	}
// --------------------to scan the input from the console
	public static void scan()
	{
		Scanner in = new Scanner(System.in);
		//System.out.print("----Please make your choice (for example: 1):");
		s = in.nextLine();
		System.out.println("");
		//System.out.print("----input is "+s);
	}
// -------------------------to check the choice and go to different class by the if else
//	public static void option()
//	{
//		if (s == "1")
//			System.out.print("-1111111111):");
//			createappointment();
//		else if( s == "2")
//			schedule();
//		else if (s == "3")
//			delete();
//		else if( s == "4")
//			System.out.print("----Please make your choice (for example: 1):");
//		
//			
//		//System.out.print("----input is "+s);
//	}
////----------------------------to delete the appointment
//	public static void delete()
//	{
//
//	}
//	
	public static void main(String [ ] args)
	{
		showmenu();
		scan();
	}
	

}
