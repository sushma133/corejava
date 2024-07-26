package controlstatement.loops;

import java.util.Scanner;

public class Palindromenumber {

	
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,temp,r,s=0;
		 n=sc.nextInt();
		 temp=n;
		 
		 while(n>0){
		     r=n%10;
		     s=s*10+r;
		     n=n/10;
		     
		     
		 }
		 if(s==temp)
		 {
		     System.out.println(temp+"palindrome");
		 }
		 else{
		     System.out.println(temp+"not palindrome");
		 }
		
		}
	}



