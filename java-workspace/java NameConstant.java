
import java.util.Scanner;
public class NameConstant{
	public static void main(String[] args){
		final double PI = 3014159;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");	
		double radius = sc.nextDouble();
		double area = radius * radius * PI;

		System.out.println("The area is " + area);

	}
}
