import java.util.Scanner;
class p09countchars{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter String to fine letters,  spaces, numbers and other chars");
		String str = sc.nextLine();

		int letters = 0;

		int spaces = 0;

		int numbers = 0;

		int others = 0;


		for(int i = 0; i <str.length(); i++){
			char  c = str.charAt(i);

			if((c>=65 && c<=90) || (c>=97 && c<=122)){
				letters++;
			}



			if(c==32){
				spaces++;
			}

			if( (c>=48 && c<=57)){
				numbers++;
			}else others++;



		}	


		System.out.println( letters+" letters " );

		System.out.println( spaces+ " spaces " );
		System.out.println(numbers + " numbers "  );
		System.out.println(others+ " other characters "  );
	}	

}

