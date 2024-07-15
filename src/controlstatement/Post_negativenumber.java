package controlstatement;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative.
public class Post_negativenumber {
	
	public static void main(String[]args)
	{
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		if(num>0) {
		System.out.println(num+"  is postive number");
		}
		else if(num<0) {
		System.out.println(num+" is Negative number");
		}
		
		else {
			System.out.println("It's zero");
		}
		sc.close();
	}
	

}
