package task5_ques4;

import java.util.HashMap;

public class ques4 {

	public static void main(String[] args) {
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
