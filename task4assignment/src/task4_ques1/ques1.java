package task4_ques1;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int arr[]= new int[50];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
	      System.out.print(arr[i]+" ");
			
		}

	}

}
