package Task1_ques5;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		double rad, area=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        rad = sc.nextDouble();  
        area = 3.14*rad*rad;
        System.out.println("Area is :"+area);
        
	}

}
