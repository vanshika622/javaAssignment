package task6_ques2;

class Triangle{
	int a=3,b=4,c=5;
	double area() {
		int sum= (a+b+c)/2;
		int ans;
		ans = sum*(sum-a)*(sum-b)*(sum-c);
		
		return Math.sqrt(ans);
	}
	int perimeter() {
		int ans= a+b+c;
		
		return ans;
	}
}
public class ques2 {

	public static void main(String[] args) {
		Triangle tri= new Triangle();
		System.out.println(tri.area());
		System.out.println(tri.perimeter());
		
	}

}
