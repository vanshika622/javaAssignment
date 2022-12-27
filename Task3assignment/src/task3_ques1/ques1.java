package task3_ques1;

public class ques1 {

	public static void main(String[] args) {
		int n = 10, a = 0, b = 1;
	    

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(a + ", ");

	      // compute the next term
	      int c = a + b;
	      a = b;
	      b = c;
	    }
	}

}
