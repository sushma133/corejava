package controlstatement.loops;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the end number (positive integer):");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                
                for (int i = 2; i <= n; i ++) {
                	if(i%2==0) {
                    System.out.println(i);
                	}
                }
            }
         sc.close();
    }
        
    }

