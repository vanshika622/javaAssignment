package task7_ques3;

import java.util.Arrays;

public class ques3 {

	public static void main(String[] args) {
        String str="ghfhvbjknn";
        char[] chArray = str.toCharArray();
          Arrays.sort(chArray);
 
        for (int i = 0; i < chArray.length - 1; i++) {
          
            if (chArray[i] != chArray[i + 1])
                continue;
 
            
            else {
                System.out.println("String does not contain all unique characters");
                return;
            }
        }
        System.out.println("String contain all unique characters");
    
	}

}
