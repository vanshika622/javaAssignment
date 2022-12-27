package task7_ques2;

public class ques2 {

	public static void main(String[] args) {
		 int arr1[] = {3, 6, 9, 7, 2};
	      int arr2[] = {7, 4, 9, 8, 5};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<arr1.length; i++ ) {
	         for(int j = 0; j<arr2.length; j++) {
	            if(arr1[i]==arr2[j]) {
	               System.out.println(arr2[j]);
	            }
	         }
	      }

	}

}
