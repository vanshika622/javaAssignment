package task5_ques1;

public class ques1 {

	public static void main(String[] args) {

	   String str  =  "Consultadd";

	     int n = str.length(); 

	       String rev ="";

	       char ch;
          for(int i=0;i<n;i++){

	         ch= str.charAt(i);
            rev = ch+rev;

	       }

	       System.out.println("Reversed string: "+rev);

	}

}
