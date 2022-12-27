package Task2_ques5;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks");
		double percentage = scan.nextDouble();

		if(percentage >= 90){
			System.out.println("Grade A");
		}else if(percentage < 90 && percentage >= 75){
			System.out.println("Grade B");
		}else if(percentage < 75 && percentage >= 60){
			System.out.println("Grade C");
		}else {
			System.out.println("Failed!");
		}

	}

}
