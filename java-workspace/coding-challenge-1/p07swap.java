import java.util.Scanner;
class p07swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		
		int a = 45;
		int b = 98;

		System.out.println("before swap");
		show(a,b);


		int temp = a;
		a = b;
		b = temp;

		System.out.println("after swap");
		show(a,b);

	}	

	public static void show(int a,int b){
		
		System.out.println("a = " + a + " and b = " + b);
	}

}

