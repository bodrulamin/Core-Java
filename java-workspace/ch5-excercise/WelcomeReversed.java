import java.util.Scanner;
class WelcomeReversed{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter Text" );
		String s = sc.nextLine();
		for(int i = s.length()-1; i>=0; i--){

		System.out.println(s.charAt(i));

		}
//		for(int i = 0; i<s.length() ; i++){
//
//		System.out.print(s.charAt(s.length()-i-1));
//
//		}


	}	

}
