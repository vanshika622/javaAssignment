package task3_ques3;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		int num;
	      System.out.println("Enter a number : ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
	    boolean flag = false;
	    
	    for (int i = 2; i <= num / 2; ++i) {
	      
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }

	}


