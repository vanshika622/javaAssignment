package task3_ques4;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		int num;
	      System.out.println("Enter a number : ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
	      int i=0, sum=0;;
	      while(i<=num) {
	    	  sum+=i;
	    	  i++;
	      }
	      System.out.println(sum);

	}

}
