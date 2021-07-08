import java.util.Scanner;
class MathSqrt{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("------Max Min Calculation");
		
		System.out.print("Enter num1 :");
		double num1 = sc.nextDouble();
		System.out.print("Enter num2 :");
		
		double num2 = sc.nextDouble();
		System.out.println("Max is " + Math.max(num1,num2));

		System.out.println("Min is " + Math.min(num1,num2));
	}	

}
