package Task2_ques4;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      if((year%4==0)||((year %4 ==0)&&(year%100==0))) {
	    	  System.out.println(year +" is a leap Year");
	      }
	      else {
	    	  System.out.println(year +" is not a leap Year");
	      }

	}

}
