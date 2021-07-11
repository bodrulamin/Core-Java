import java.util.Scanner;
class oddNumber{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] n = {21,36,54,89,25,54,};

	int length = n.length;
	for(int i = 0; i <length; i++){
		if(n[i]%2!=0)
		    System.out.println(n[i]);
	}	




    }	

}

