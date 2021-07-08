import java.util.Scanner;
class Loops{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	

		String s = ("Welcome to java");
		for(int i = 0; i<s.length() ; i++){
			if(i>7) continue;
			System.out.print(s.charAt(s.length()-1-i));

		}


	}	

}
