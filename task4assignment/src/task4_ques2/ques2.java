package task4_ques2;

import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		int n,sum=0;
		float avg=0;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int arr[]= new int[50];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
		     sum+=arr[i]; 
				
			}
		avg= sum/n;
		 System.out.print(avg+" ");

	}

}
