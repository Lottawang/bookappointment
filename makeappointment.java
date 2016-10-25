package bookappointmentapp;

import java.util.Arrays;
import java.util.Scanner;

public class createappointment {
	

			
	static String s1;
	static String s2;
	static String s3;
//--------------to store the description by the array	
	static String[] desp = new String[1024];
	static String[] shour = new String[1024];
	static String[] smin = new String[1024];
	static String[] ehour = new String[1024];
	static String[] emin = new String[1024];
	
	
	public static void create()
	{
		 System.out.println("");
		 System.out.println("********************************************************");
		 System.out.println("------------Welcome to create new appointment!------------");
		 System.out.println("********************************************************");
		 System.out.println("");
		 
		 Scanner in1 = new Scanner(System.in);
//---------------define the max amount of appointments is 1024		 
		 for(int n=0; n<=1024; n++)
		 {
			 System.out.println("-----Please enter description: ");
			 s1 = in1.nextLine();
			 desp[n] = s1;
			 //System.out.println("You entered string "+s1);
			 System.out.println("-----Please enter start time (hh:mm): ");
			 s2 = in1.nextLine();
//---------------split the hour and minute			 
			 String[] split = s2.split(":");
			 shour[n] = split[0];
			 smin[n]= split[1];
			 split[0]=null ;
			 split[1]=null ;
//------------------check the hour and minute is valid or not
			 if(shour[])
			 //System.out.println("shour" + shour[n] + ":min " + smin[n]+"split " + split[0]+"split1 " + split[1]);
			 //System.out.println("You entered string "+s2);
			 System.out.println("-----please enter a end time (hh:mm): ");
			 s3 = in1.nextLine();
			 String[] split1 = s3.split(":");
			 ehour[n] = split1[0];
			 emin[n]= split1[1];
			 split1[0]=null ;
			 split1[1]=null ;
			 System.out.println("shour" + ehour[n] + ":min " + emin[n]+"split1 " + split1[0]+"split1 " + split1[1]);
			 System.out.println("You entered string "+s3);
		 }
		 
	}
	
	public static void main(String[] args)
	{
		create();
	}
	

}
