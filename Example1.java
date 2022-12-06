package assignment;
import java.util.Scanner;
public class Example1 {
//area of circle in java 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int r= sc.nextInt();
		double area;
		
		 area = Math.PI*r*r;
		System.out.println("area of circle is"+area);
	}

}
