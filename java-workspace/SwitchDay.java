
// 4 subj avg jodi 79 69 59 F
//
import java.util.Scanner;
class SwitchDay{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Day number");
		int day =  sc.nextInt();
		
		switch(day){
			case 0: System.out.println(" Today is saturday" ); break;
			case 1: System.out.println("  Today is sunday"  ); break;
			case 2: System.out.println("  Today is monday"  ); break;
			case 3: System.out.println("  Today is tuesday" ); break;
			case 4: System.out.println(" Today is wednesday"); break;
			case 5: System.out.println(" Today is thursday" ); break;
			case 6: System.out.println( "Today is Friday"   ); break;
		}
		}	
	
}	
