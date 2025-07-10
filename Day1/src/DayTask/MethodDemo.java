package DayTask;
import java.util.*;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		// Ares of Triangle
		Scanner sc = new Scanner(System.in);
		System.out.println("Side of Triangle A:");
		int n = sc.nextInt();
		
		System.out.println("Side of Triangle B:");
		int m = sc.nextInt();
		
		int k = (n*m)/2;
		
		System.out.println("Area of Triangle:"+ k);
		
		// Area of Circle
		System.out.println("Circle R:");
		int r = sc.nextInt();
		
		double C = (3.14*3.14*r);
		System.out.println("Area of Circle:"+ C);
		

	}

}
