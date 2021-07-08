import java.util.Scanner;
class p05avg{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] nums = {20,25,32,40,90,40};

	double sum = 0;
	int length = nums.length;
	for(int i = 0; i <length; i++){
	    sum += nums[i];	

	}	

	double avg = sum/length;

	System.out.println("The avg is " + avg);

    }	

}

