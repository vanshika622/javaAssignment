package task7assignment;

public class task7_ques1 {

	public static void main(String[] args) {
		String str ="Cookies";
        boolean flag = true;

        for(char i :str.toCharArray())
        {
            
            if (str.indexOf(i) == str.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    }

	}


