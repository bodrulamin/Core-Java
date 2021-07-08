import java.util.Scanner;
class p01charAt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter String ");
		String str = sc.nextLine();

		System.out.print("Enter index to get Character ");
		int i = sc.nextInt();


		
		System.out.println("The charecter at position "+ i+ " is " + str.charAt(i));

	


	}	

}

