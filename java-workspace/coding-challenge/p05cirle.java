import java.util.Scanner;
class p05cirle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	

		System.out.print("input radius of circle = ");
		double radius = sc.nextDouble();
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI * Math.pow(radius,2);

		System.out.println("Perimeter is = " + perimeter);

		System.out.println("Area is = " + area);

	}	


