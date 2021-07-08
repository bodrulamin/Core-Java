import java.util.Arrays;
import java.util.Scanner;
class p07findIndex{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] nums = {20,25,32,40,90,49};

	System.out.println(Arrays.toString(nums));

	System.out.println("Enter value to find index");

	int value = sc.nextInt();
	int index = -1;

	for(int i = 0; i<nums.length;i++){
	    if(nums[i] == value){
		index = i;
		break;
	    }	

	}

	if(index!=-1)
	    System.out.println("index of the value is  " + index);
	else 
	    System.out.println("Array does not  conatains " + value);

    }
}
