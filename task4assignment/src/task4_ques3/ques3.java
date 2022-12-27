package task4_ques3;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		int n, key;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		key= sc.nextInt();
		int arr[]= new int[50];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		boolean flag=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				flag=true;
				break;
			}
				
			
		}
		if(flag==true) {
			System.out.print("Element is present in array");
		}
		else {
			System.out.print("Element is not present in array");
		}
		

	}

}
