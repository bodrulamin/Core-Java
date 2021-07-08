import java.util.Scanner;
class p06avg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	

		int count  = -1;
		double sum = 0;
		double input = 0;
		double avg = 0;
		while(input != -1){
			sum+=input;
			count +=1;
			avg = sum/count;
			

			System.out.println("===============================");
			System.out.println("sum = " + sum + " number count = " + count + " Average = "+ avg);

			System.out.println("===============================");
			System.out.print("-1 to exit, Enter number ");
			input = sc.nextDouble();

		}

		System.out.println("sum = " + sum + " number count = " + count + " Average = "+ avg);

	}	

}
