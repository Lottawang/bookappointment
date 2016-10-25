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
	
	public static void showmenu()
	{
		 System.out.println("");
		 System.out.println("********************************************************");
		 System.out.println("------------My Appointment book application------------");
		 System.out.println("********************************************************");
		 System.out.println("");
		 System.out.println("---Here are some options:");
		 System.out.println("");
		 System.out.println("1. Create a new appointment");
		 System.out.println("2. Display all appointments (in order)");
		 System.out.println("3. Delete an appointment");
		 System.out.println("4. Exit");
		 System.out.println("");
		 //System.out.print("----Please make your choice (for example: 1):");
	}
	public static void scan()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("----Please make your choice (for example: 1):");
		s = in.nextLine();
		//System.out.print("----input is "+s);
	}
	public static void main(String [ ] args)
	{
		showmenu();
		scan();
	}

}
