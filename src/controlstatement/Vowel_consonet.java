package controlstatement;

import java.util.Scanner;

//Java Program to check Vowel or Consonant using Switch Case
public class Vowel_consonet {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter any character:");
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
			default:
				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    System.out.println(c + " is a consonant.");
                } else {
                    System.out.println(c + " is not a valid alphabet letter.");
                }
				
		}
		sc.close();

	}

}
