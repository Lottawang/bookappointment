package bookappointmentapp;

import java.util.Scanner;

public class createappointment {
	
	static String s1;
	static String s2;
	static String s3;
	
	public static void create()
	{
		System.out.println("");
		 System.out.println("********************************************************");
		 System.out.println("------------Welcome to create new appointment!------------");
		 System.out.println("********************************************************");
		 System.out.println("");
		 
		 Scanner in1 = new Scanner(System.in);
		 
		 System.out.println("-----Please enter description: ");
		 s1 = in1.nextLine();
		 System.out.println("You entered string "+s1);
		 System.out.println("-----Please enter start time (hh:mm): ");
		 s2 = in1.nextLine();
		 System.out.println("You entered string "+s2);
		 System.out.println("-----please enter a end time (hh:mm): ");
		 s3 = in1.nextLine();
		 System.out.println("You entered string "+s3);

		 
	}
	
	public static void main(String[] args)
	{
		create();
	}
	

}
