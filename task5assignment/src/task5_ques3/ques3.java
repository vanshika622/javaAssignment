package task5_ques3;

import java.util.Arrays;

public class ques3 {

	public static void main(String[] args) {
		String str1= "care";
		String str2="race";
		 if (str1.length() != str2.length()) {
			 System.out.println("not anagram");
			 return;
		    }
		    char[] a1 = str1.toCharArray();
		    char[] a2 = str2.toCharArray();
		    Arrays.sort(a1);
		    Arrays.sort(a2);
		    boolean ans=  Arrays.equals(a1, a2);
		    System.out.print(ans);
		    

	}

}
