package task7_ques8;

import java.util.Scanner;

public class ques8 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		int arr[]= new int[50];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int maxi=  Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(maxi<arr[i]) {
				maxi=arr[i];
			}
		}
		System.out.print(maxi);

	}

}
