package Task2_ques1;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a = sc.nextInt();
        if(a<0) {
        	System.out.println("a is negative");
        }
        else {
        	System.out.println("a is positive");
        }

	}

}
