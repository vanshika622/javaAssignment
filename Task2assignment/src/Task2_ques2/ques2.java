package Task2_ques2;

public class ques2 {

	public static void main(String[] args) {
		char ch = '@';

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet.");
        else
            System.out.println(ch + " is a character.");

	}

}
