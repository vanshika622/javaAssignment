package task7_ques6;

import java.util.HashMap;

public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Consultadd";  
		 
		HashMap <Character, Integer> mp = new HashMap<>();  
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
		if(mp.containsKey(str.charAt(i)))   
		{  
		int count = mp.get(str.charAt(i));  
		mp.put(str.charAt(i), ++count);  
		}   
		else   
		{  
		mp.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(mp);  


	}

}
