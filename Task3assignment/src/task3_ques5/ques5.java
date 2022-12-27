package task3_ques5;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     
	        int a, b;
	        char choice;
	        
	        do
	        {
	            System.out.print("Enter the  numbers:  ");
	            a = sc.nextInt();
	            b = sc.nextInt();
	            
	            int sum = a + b;
	            System.out.println("Sum : " + sum);
	        
	            System.out.print("Do you want to continue y/n? ");
	            choice = sc.next().charAt(0);
	            
	            System.out.println();
	            
	        }while(choice=='y' || choice == 'Y');
	}

}
