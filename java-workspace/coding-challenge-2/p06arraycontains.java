import java.util.Arrays;
import java.util.Scanner;
class p06arraycontains{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] nums = {20,25,32,40,90,40};
	System.out.println(Arrays.toString(nums));

	System.out.println("Enter value to check");
	int value = sc.nextInt();
	boolean contain = false;
	for(int i:nums){
	    if(i == value){
		contain = true;
		break;
	    }	

	}
	if(contain){
	System.out.println("Array conatains " + value);
	}else 
	System.out.println("Array does not  conatains " + value);

    }
}
