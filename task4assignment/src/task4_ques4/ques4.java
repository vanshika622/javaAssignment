package task4_ques4;

import java.util.Scanner;

public class ques4 {

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
		int low=0;
		int high= n-1;
		int mid = (low + high)/2;  
		   while( low <= high ){  
		      if ( arr[mid] < key ){  
		        low = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        
		        break;  
		      }else{  
		         high = mid - 1;  
		      }  
		      mid = (low +high)/2;  
		   }
		   if(low> high) {
			   System.out.print("Element is not present in array");
		   }
	}

}
