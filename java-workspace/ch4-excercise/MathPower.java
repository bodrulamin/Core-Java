import java.util.Scanner;
class MathPower{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double b = sc.nextDouble();
		
		System.out.println("Enter power");
		double p = sc.nextDouble();

		System.out.println(Math.pow(b,p));
	
	}

}
