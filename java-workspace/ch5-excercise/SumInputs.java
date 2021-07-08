import java.util.Scanner;
class SumInputs{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	

		int i=0; 
		int sum = 0;
		while(i != -1){

			sum += i;
			System.out.println("Enter value "+sum);
			i = sc.nextInt();
		}


		System.out.println("total : " + sum);

	}	
}	

