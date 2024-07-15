//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z
package controlstatement;


import java.util.Scanner;

public class Char_low_upper {
	public static void main (String []args)
	{
		Scanner sc= new Scanner(System.in);
		char c;
		System.out.println("Enter any alphabet:");
		c=sc.next().charAt(0);
		if (c >='a' && c<='z') {
			System.out.println(c+"is in lowercase ");	
		}
		else if(c>='A'&& c<='Z') {
			System.out.println(c+"is in Uppercase");
		}
		else {
			System.out.println("Enter the valid character");
		}
		sc.close();
	}

}
