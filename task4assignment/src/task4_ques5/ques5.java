package task4_ques5;

public class ques5 {

	public static void main(String[] args) {
		int a[][]={{7,4,4},{4,4,3}};    
		int b[][]={{8,1,2},{1,5,9}};    
		    
		
		int c[][]=new int[2][2];  
		    
		  
		for(int i=0;i<2;i++){    
		for(int j=0;j<2;j++){    
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");    
		}    
		   
		}    

	}

}
