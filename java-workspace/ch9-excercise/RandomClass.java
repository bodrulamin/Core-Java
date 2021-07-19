import java.util.Scanner;
import java.util.Random;
class RandomClass{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	

	Random rnd = new Random();
	Random rnd2 = new Random();

	System.out.println(rnd.nextInt(9999));
	System.out.println(rnd.nextInt(9999));
	System.out.println(rnd.nextInt(9999));
	System.out.println(rnd.nextInt(9999));
	System.out.println(rnd.nextInt(9999));
	System.out.println(rnd.nextInt(9999));
	
	System.out.println();

	System.out.println(rnd2.nextInt(9999));
	System.out.println(rnd2.nextInt(9999));
	System.out.println(rnd2.nextInt(9999));
	System.out.println(rnd2.nextInt(9999));
	System.out.println(rnd2.nextInt(9999));


    }	

}

