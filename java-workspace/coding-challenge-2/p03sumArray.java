import java.util.Scanner;
class p03sumArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter -1 to exit");
		double sum = 0;
		double input = 0;
		while(input!=-1){
		sum += input;
		
		System.out.println("	Enter number to add " + "	sum = " + sum  );
		input = sc.nextDouble();
		
		}



		System.out.println("Total = " + sum );
	}	

}

