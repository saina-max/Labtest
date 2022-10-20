/*
Program: WAP to perform arthmetuc operation
@author: Saina Khan
@Date : 20 Oct 2022
*/
import java.util.Scanner;
//declaring a class
class Calculator
{
 //metod to add 2 numbers
 static void add(float n1,float n2)
 {
 
float result=n1+n2;
System.out.println("the result is :"+result);
}
//end of method
statis void sub(float n1,float n2)//formal/dummy arguments
{
float result=n1+n2;
System.out.println("The result is :"+result);
}
//end of method
//main started
public static void main(String args[])
{
//declaring the object of scanner
Scanner sc=new Scanner[System.in);
float num1,num2;
int choice;
System.out.println("Enter the two numbers:");
num1=sc.nextfloat();
num2=sc.nextfloat();
//menu
System.out.print("1.Add");
System.out.print("2.Subtract");
System.out.print("3.Multiply");
System.out.print("4.Divide");
System.out.print("5.Exit");
system.out.println("Enter the choice:");
//switch case
switch(choice)
{
case 1:add(num1,num2);
break;
case 2:sub(num1,num2);
break;
case 3:mul(num1,num2);
break;
case 4:div(num1,num2);
break;
case 5:System.exit(0);
break;
default:System.out.println("Wrong input");
}
}
//end of class




