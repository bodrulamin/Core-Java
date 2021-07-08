import java.util.Scanner;
class StEquals{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter String 2 ");
		String s1 = sc.nextLine();

		System.out.println("Enter String 2 ");
		String s2 = sc.nextLine();


		System.out.println(s1.equals(s2)? "They are equal" : "They are not equal");


	}	

}
