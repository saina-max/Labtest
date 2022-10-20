/*
Program: WAP to print Even Odd number using switch case
@author: Saina Khan
@Date: 20 oct 2022  
*/

//import packages 

import java.util.Scanner;

//declaring a class
class SwitchEo
{
	public static void main (String args[])
	{
      Scanner sc = new Scanner(System.in);
       System.out.print("enter the no.:");
	   int num=sc.next.Int();
	   
        //main method
		
		{
	   //switch case
	   switch(num%2){//this will return either 0 or 1
	   
		   case 0:System.out.println("Number is Even"+num);
		          break;
		   case 1:System.out.println("Number is Odd"+num);
		          break;		  
	   
	// end of switchcase
	    }
	// end of main
    }
}
 
 
 
 