package bookappointmentapp;

import java.util.Scanner;

public class makeappointment {
	

			
	//static String s1;
	//static String s2;
	//static String s3;
//--------------to store the description by the array	
	static String[] desp = new String[1024];
	static int[] shour = new int[1024];
	static int[] smin = new int[1024];
	static int[] ehour = new int[1024];
	static int[] emin = new int[1024];
	
	
	public static void title()
	{
		 System.out.println("");
		 System.out.println("********************************************************");
		 System.out.println("------------Welcome to create new appointment!------------");
		 System.out.println("********************************************************");
		 System.out.println("");
	}
	
	public static  String description ()
	{
		String s1;
		Scanner in1 = new Scanner(System.in);
		System.out.println("-----Please enter description: ");
		s1 = in1.nextLine();
		return s1;
	}
	
	public static  String starttime ()
	{
		String s2;
		Scanner in2 = new Scanner(System.in);
		System.out.println("-----Please enter start time (hh:mm): ");
		 s2 = in2.nextLine();
		return s2;
	}
	
	public static  String endtime ()
	{
		String s3;
		Scanner in3 = new Scanner(System.in);
		System.out.println("-----Please enter end time (hh:mm): ");
		 s3 = in3.nextLine();
		return s3;
	}
	
	public int splittoInt (String s)
	{
		String[] split = s.split(":");
		int[] intArray = new int[split.length];
		intArray[0] = Integer.parseInt(split[0]);
		intArray[1] = Integer.parseInt(split[1]);
		split[0]=null ;
		split[1]=null ;
		return intArray[0];
		return intArray[1];	
	}
	
	public static boolean vaildatetime(int hour, int minute)
	{
		if ( hour < 0 | hour > 23 | minute < 0 | minute > 59 )
		{
			System.out.println("invalid time, hour must be between 0 and 23, minute must be between 0 and 59");
			return false;
		}
		return true;
		System.out.println("new appointment created.");
	}
	//youwenti
	public boolean conflict(int hour, int minute)
	{
		if ( hour < 0 | hour > 23 | minute < 0 | minute > 59 )
		{
			System.out.println("invalid time, hour must be between 0 and 23, minute must be between 0 and 59");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		 int hour,minute;
		 title();
		 description ();
		 starttime();
		 vaildatetime(hour, minute);
		 endtime();
		 vaildatetime(hour, minute);
	}
	
}
	
		 //Scanner in1 = new Scanner(System.in);
//---------------define the max amount of appointments is 1024		 
		// for(int n=0; n<=1024; n++)
		 //{
		 //System.out.println("-----Please enter description: ");
			// s1 = in1.nextLine();
			 desp[n] = s1;
			 //System.out.println("You entered string "+s1);
			// System.out.println("-----Please enter start time (hh:mm): ");
			// s2 = in1.nextLine();
//---------------split the hour and minute			 
			 //String[] split = s2.split(":");
			// int[] intArray = new int[split.length];
//			 intArray[0] = Integer.parseInt(split[0]);
//			 intArray[1] = Integer.parseInt(split[1]);
			 shour[n] = intArray[0];
			 smin[n]= intArray[1];
			 //split[0]=null ;
			// split[1]=null ;
//------------------check the hour and minute is valid or not
			 //这里要用while循环
//			 if((shour[n]<0)|(shour[n]>11)|(smin[n]<0)|(smin[n]>59))
//			 {
//				System.out.println("invalid time, hour must be between 0 and 23， minute must be between 0 and 59");
//				
//				
//			 }
			 //System.out.println("shour" + shour[n] + ":min " + smin[n]+"split " + split[0]+"split1 " + split[1]);
			 //System.out.println("You entered string "+s2);
//			 System.out.println("-----please enter a end time (hh:mm): ");
//			 s3 = in1.nextLine();
//			 String[] split1 = s3.split(":");
//			 int[] intArray1 = new int[split.length];
//			 intArray1[0] = Integer.parseInt(split1[0]);
//			 intArray1[1] = Integer.parseInt(split1[1]);
//			 ehour[n] = intArray1[0];
//			 emin[n]= intArray1[1];
//			 split1[0]=null ;
//			 split1[1]=null ;
//			 System.out.println("shour" + ehour[n] + ":min " + emin[n]+"split1 " + split1[0]+"split1 " + split1[1]);
//			 System.out.println("You entered string "+s3);
//		 }
		 
//	}
//	
//	public static void main(String[] args)
//	{
//		create();
//	}
	

//}

