package Task1_ques3;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		int a,b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        a = sc.nextInt();  
       b = sc.nextInt(); 
       c=a;
       a=b;
       b=c;
       System.out.println("a :"+a);
       System.out.println("b :"+c);
	}

}
