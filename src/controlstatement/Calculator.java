/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/
package controlstatement;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String []args)
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("My Calculator");
		
		System.out.println("Enter Your choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulo or remainder");
		int opr=sc.nextInt();
		System.out.println("Enter the First number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		
		
		
		switch(opr) {
		case 1:
			System.out.println(a+b);
	break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:if(b==0) {
			System.out.println("Invalid Division");
		}else {
			System.out.println(a/b);
		}
			break;
		case 5:
			if(b==0){
				System.out.println("Invalid Division");
			}
			else {
			System.out.println(a%b);
			}
			break;
			default:
			System.out.println(" Invalid operator");
		}
		
		
		
		sc.close();

	}
	
}
