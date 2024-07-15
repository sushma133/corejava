package controlstatement;

import java.util.Scanner;

public class Leap_year_or_not {

	public static void main(String[] args) {
		int year = 0;
		System.out.println("Enter the year:");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		boolean isLeap=false;
		// Check if the year is divisible by 4
		if(year%4==0) {
			// Further check if the year is divisible by 100
			if(year%100!=0) {
				// Year is divisible by 4 but not by 100
				isLeap=true;
			}
			else if(year%400==0) {
				// Year is divisible by 100 and also by 400
				isLeap=true;
			}
		}
		if(isLeap==true) {
			System.out.println(year+"Is a Leap Year");
		}
		else {
			System.out.println(year+"not a leap year");
		}
		
		sc.close();

	}
	

}
