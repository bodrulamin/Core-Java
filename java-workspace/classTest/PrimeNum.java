import java.util.Scanner;
class PrimeNum{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();

	boolean isPrime = true;
	for(int i = 2 ; i < n; i++){
	    if(n%i==0){
		isPrime = false;
	    }
	}	

	if(n<2) isPrime = false;

	if(isPrime)	{
	    System.out.println(n+ " Prime Number");
	}else 
	    System.out.println(n+" not Prime Number");



    }	

}

