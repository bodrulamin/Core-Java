import java.util.Scanner;
class p04printGrid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter grid symbol");
		String str = sc.nextLine();


		int length = 10;
		for(int i = 0; i <length; i++){

			for(int j = 0; j <length; j++){

				System.out.print(str+" ");
			}	


		System.out.println();

		}	

	}	

}

