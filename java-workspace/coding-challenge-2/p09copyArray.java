import java.util.Arrays;
import java.util.Scanner;
class p09copyArray{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] nums = {20,25,32,40,90,49};
	int[] newArray = new int[nums.length] ;

	System.out.print("current Array ");
	System.out.println(Arrays.toString(nums));




	for(int i = 0; i<nums.length;i++){
	    newArray[i] = nums[i];
	}

	
	System.out.print("new Array ");
	System.out.println(Arrays.toString(nums));

    }
}
