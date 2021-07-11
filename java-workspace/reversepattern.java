import java.util.Scanner;
class reversepatter{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	

	int length = sc.nextInt();
	for(int i = 0; i <length; i++){


	    for(int j = 0; j <i; j++){
		if(j<length-i){
			System.out.print(" ");

		}else System.out.print("*");
	    }	

	    System.out.println();
	}	


    }	

}

