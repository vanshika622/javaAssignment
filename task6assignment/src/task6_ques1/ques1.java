package task6_ques1;
 class Student{
	String name="";
	int EnrollmentNo=0;
	Student(String name, int EnrollmentNo){
		this.name=name;
		this.EnrollmentNo=EnrollmentNo;
		
	}
}
public class ques1 {

	public static void main(String[] args) {
		  Student st= new Student("Amay", 132);
		  System.out.println(st.name);
		  System.out.println(st.EnrollmentNo);
		  

	}

}
