import java.util.Scanner;
class MathRound{
	public static void main(String[] a){
		System.out.println("enter double value");

		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();

		System.out.println("ceil "  +Math.ceil(value));
		System.out.println("floor " +Math.floor(value));
		System.out.println("rint "  +Math.rint(value));
		System.out.println("round " +Math.round(value));


	}
}
