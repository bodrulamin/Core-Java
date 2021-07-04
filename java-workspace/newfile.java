
import java.util.Scanner;

class newfile{
	public static void main(String[] a){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mark");
		int mark = input.nextInt();
		
		     if(mark>79) System.out.println("A+");
		else if(mark>69) System.out.println("A");
		else if(mark>59) System.out.println("B+");
		else if(mark>49) System.out.println("B");
		else if(mark>39) System.out.println("C");
		else if(mark>33) System.out.println("D");
		else             System.out.println("F");

	}

}
