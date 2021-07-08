import java.util.Scanner;
class MethodCall{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int b = sc.nextInt();
		add(a,b);
		minus(a,b);
		multiply(a,b);
		devide(a,b);;


	}

	public static void add(int a,int b){

		System.out.print("Add =");
		System.out.println(a+b);
	}	

	public static void minus(int a,int b){

		System.out.print("minus =");
		System.out.println(a-b);
	}	
	public static void multiply(int a,int b){

		System.out.print("multiply =");
		System.out.println(a+b);
	}	

	public static void devide(int a,int b){

		System.out.print("devide =");
		System.out.println(a+b);
	}	


}

