import java.util.Scanner;
class ArrayExample{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);	


		String names[] = {"Bodrul","Sakib","Yakub","Munajir","Rabeya","Mehedi"};

		for(int i=0; i<names.length; i++){

			if(names[i]!="Rabeya")	
				System.out.println(names[i]);
		}
	}	

}

