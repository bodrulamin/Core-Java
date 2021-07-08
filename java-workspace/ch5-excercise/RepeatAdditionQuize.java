import java.util.Scanner;
class RepeatAdditionQuize{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	
		int n1 =(int) (Math.random()*10);
		int n2 = (int) (Math.random()*10);

		System.out.println(n1+"+"+n2+"=?");
		int ans = sc.nextInt();
		while(n1+n2!=ans){

			System.out.println("Wrong Answer try again!");
			System.out.println(n1+"+"+n2+"=?");
			ans = sc.nextInt();
		}


		System.out.println(ans+" correct Answer");

	}	
}	

