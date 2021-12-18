package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number to generate its multiplication table: ");
		int n  = obj.nextInt();
		System.out.println("The multiplication table of "+ n +" is :");

	   for(int i=1; i<=10;i++) 
	   {
		   int multiplication = n*i;
		   System.out.println(multiplication);
	   }
	}
}

