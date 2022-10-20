/*
Program: WAP to 
@author: Saina Khan
@Date : 20 Oct 2022
*/
import java.util.Scanner;
//declaring a class
class YoungOld
{
public static void main (String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables 
		int per1,per2,per3;
		
		//taking input
		System.out.println("Enter age of per1:");
		per1= sc.nextInt();
		System.out.println("Enter age of per2:");
		per2= sc.nextInt();
		System.out.println("Enter age of per3:");
		per3= sc.nextInt();
		
		//checking oldest one 
		{
		
		if((per1>per2)&&(per1>per3))
	     	 System.out.println("The person 1 is oldest among all  :"+per1);
			   
		else if(per2>per3)
			 System.out.println("The person 2 is oldest among all:"+per2);
		     
			 else
				 System.out.println("The person 3  is oldest amoung all:"+per3);
			
        }


        //Checking Youngest one
		
		{
        if((per1>per3)&&(per2>per3))
	     	 System.out.println("The person 3 is Youngest among all  :"+per3);
			   
		else if(per1>per2)
			 System.out.println("The person 2 is Youngest among all:"+per2);
		     
			 else
				 System.out.println("The Person 1 is Youngest amoung all:"+per1);
			 
		//end of outer ifelse	
		
		    
	    }
		
	// end of main
    }
// end of class 
}