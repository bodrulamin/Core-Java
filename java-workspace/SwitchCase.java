// 4 subj avg jodi 79 69 59 F
//
import java.util.Scanner;
class SwitchCase{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bangla Mark");
		int bn =  sc.nextInt();

		System.out.println("Enter English Mark");
		int en=  sc.nextInt();

		System.out.println("Enter Math Mark");
		int mt =  sc.nextInt();

		System.out.println("Enter General Knowledge Mark");
		int gk =  sc.nextInt();

		int avg = (bn+en+mt+gk)/4;

		switch(true){
			case (avg>79) : System.out.println("A"); break;
			case (avg>69) : System.out.println("B");  break;
			case (avg>59) : System.out.println("C"); break;
			default :     System.out.println("F"); 
		}

	}	
	
}	
