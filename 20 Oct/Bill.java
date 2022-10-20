/*
Program: WAP to make a bill
@author: Saina Khan
@Date : 20 Oct 2022
*/
//import java.util.Scanner;
import java.util.Scanner;
//declaring a class
class Bill
{
public static void main (String args[])
{
	Scanner sc = new Scanner(System.in);
//declaring variables
int number;
int amount,dis,total;
//taking input
System.out.println("Enter the Light No.:");
number=sc.nextInt();

//totaling the bill here cost of 1 light is 540 given
amount=number*540;
if(amount>2000)
{
	dis=((10/100)*amount);
	
System.out.println("amount of discount is :"+dis);
total=amount-dis;

System.out.println("Total bill to be paid :"+total);

}
else
System.out.println("No Discount is available below 2000 amount");
}
}

