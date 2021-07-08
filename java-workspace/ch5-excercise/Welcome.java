import java.util.Scanner;
class Welcome{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter Text" );
		String s = sc.nextLine();

		for(int i = 0; i<s.length() ; i++){

		System.out.print(s.charAt(i));

		}


	}	

}
