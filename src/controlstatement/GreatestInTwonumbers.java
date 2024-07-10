package controlstatement;

import java.util.Scanner;

public class GreatestInTwonumbers 
{
	
	public static void main(String[]args) 
	{
		//Creating the two variables to store the numbers
	   int n1;
	   int n2;
//	 Creating the object of scanner class
	   
Scanner sc=new Scanner(System.in);
//Taking the input of two numbers from user
	
	System.out.println("Enter 1st number:");
	 n1=sc.nextInt();
	
	System.out.println("Enter 2nd number:");
	n2=sc.nextInt();
	
	//Comparing the two numbers
	if(n1>n2)
	{
		System.out.println(n1+" is greater than"+n2);
	}
	 else if(n2>n1) {
		System.out.println(n2+"is greater than "+n1);
	}
	 else {
		 System.out.println("Both are equal");
	 }

sc.close();

	}
	
		
}
	
