package task7_ques4;

public class ques4 {

	public static void main(String[] args) {
		String str= "Consultadd pvt";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.print(count);

	}

}
