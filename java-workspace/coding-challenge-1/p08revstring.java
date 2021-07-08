import java.util.Scanner;
class p08revstring {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter String to reverse");
		String str = sc.nextLine();



		for(int i = 0; i <str.length(); i++){

			System.out.print(str.charAt(str.length()-1-i));
		}	


	}	

}

