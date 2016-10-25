package bookappointmentapp;

import java.util.Scanner;

public class makeappointment {
	

	private static final int NULL = 0;
	static int i;		
	static String s1;
	static String s2;
	static String s3;
	Integer intArray[];
//--------------to store the description by the array	
	static String[] desp = new String[1024];
	static String[] starttime = new String[1024];
	static String[] endtime = new String[1024];
	static int[] shour = new int[1024];
	static int[] smin = new int[1024];
	static int[] ehour = new int[1024];
	static int[] emin = new int[1024];
	static int[] sshour = new int[1024];
	static int[] ssmin = new int[1024];
	static int[] eehour = new int[1024];
	static int[] eemin = new int[1024];
	private static Scanner in3;
	private static Scanner in2;
	private static Scanner in1;
	private static int intArrays[];
	private static Integer integer;
	
	
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
		//String s1;
		in1 = new Scanner(System.in);
		System.out.println("-----Please enter description: ");
		s1 = in1.nextLine();
		desp[0] =s1;
		return s1;
	}
	
	public static  void starttime ()
	{
		//String s2;
		in2 = new Scanner(System.in);
		System.out.println("-----Please enter start time (hh:mm): ");
		s2 = in2.nextLine();
		starttime[0] =s2;
		//System.out.println("----S IS )"+s2);
		String[] split = s2.split(":");
		int[] intArray = new int[split.length];
		//System.out.println("----kkkkkkkkkkkkkk: ");
		intArray[0] = Integer.parseInt(split[0]);
		intArray[1] = Integer.parseInt(split[1]);
		split[0]=null ;
		split[1]=null ;
		shour[0] = intArray[0];
		smin[0]= intArray[1];
		//return s2;
	}
	
	public static void endtime ()
	{
		//String s3;
		in3 = new Scanner(System.in);
		System.out.println("-----Please enter end time (hh:mm): ");
		s3 = in3.nextLine();
		endtime[0] =s3;
		//System.out.println("----S IS )"+s3);
		String[] split1 = s3.split(":");
		int[] intArray1 = new int[split1.length];
		//System.out.println("----kkkkkkkkkkkkkk: ");
		intArray1[0] = Integer.parseInt(split1[0]);
		intArray1[1] = Integer.parseInt(split1[1]);
		split1[0]=null ;
		split1[1]=null ;
		ehour[0] = intArray1[0];
		emin[0]= intArray1[1];

	}
	
	public static boolean vaildatetime(int hour, int minute)
	{
		if ( hour < 0 | hour > 23 | minute < 0 | minute > 59 )
		{
			System.out.println("invalid time, hour must be between 0 and 23, minute must be between 0 and 59");
			return false;
		}
		//System.out.println("validtime.");
		return true;
	}
	
	public static  boolean vaildateendtime(int hour, int minute)
	{
		if(vaildatetime(ehour[0], emin[0]))
		{
			if(ehour[0]<shour[0])
			{
				System.out.println("invalid time, endtime shoud be later than starttime");
				return false;
			}
			else if(ehour[0]==shour[0])
			{
				if(emin[0]<smin[0])
				{
					System.out.println("invalid time, endtime shoud be later than starttime");
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static void makeapp()
	{
		 title();
		 description ();
		 System.out.println("-----description: "+desp[0]);
		 do
		 {
			 starttime();		 
		 } while(!vaildatetime(shour[0], smin[0]));

		 do
		 {
			 endtime();		 
		 } while(!vaildateendtime(ehour[0], emin[0]));
		 sshour[0]=shour[0];
		 ssmin[0]=smin[0];
		 eehour[0] =ehour[0];
		 eemin[0]=emin[0];
		 
		 System.out.println("------new appointment created.");	
	} 
	
	public static void schedule()
	{
		int l=0;
		if(sshour==null)
		{
			System.out.println("------You have no appointments.");	
		}
		else
		{
			while((sshour[l]!= NULL)&&(l<1))
			{
				
				System.out.println("------Your appointments are:");	
				System.out.println("------"+l+".  "+desp[l]+" from "+sshour[l]+":"+ssmin[l]+" to "+eehour[l]+":"+eemin[l]);
				l++;
			}
		}
	}
	public static void delete()
	{
		int d;
		schedule();
		Scanner in4 = new Scanner(System.in);
		System.out.println("-----Please input the number of the appointment: ");
		d = in4.nextInt();

		sshour[d]=0;
		ssmin[d]=0;
	    eehour[d]=0;
	    eemin[d]=0;
		
		System.out.printf("-----appointment %d deleted ",d);
	}
//		 loopconfilct:
//			{
//				for(i=0;i<sshour.length;i++)
//				{
//					if((ehour[0]<sshour[i])&&(shour[0]>eehour[i]))
//					{
//						System.out.println("new appointment created.");
//					}
//					else if(ehour[0]==sshour[i])
//					{
//						if(emin[0]<=ssmin[i])
//						{		
//							System.out.println("new appointment created.");		
//						}
//					}
//					else if(shour[0]==eehour[i])
//					{
//						if(emin[0]>eemin[i])
//						{
//							System.out.println("new appointment created.");
//						}
//						
//					}
//					else
//					{
//						System.out.println("invalid appointment, conflict detected.");
//						break loopconfilct;
//					}
//					
//
//				}
//
//			
//
//			}
}
	
		 
