import java.util.Arrays;
import java.util.Scanner;
class p07findIndex{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] nums = {20,25,32,40,90,49};

	System.out.println(Arrays.toString(nums));

	int max = nums[0];
	int min = nums[0];
	for(int i = 0; i<nums.length;i++){
	    if(max<nums[i]) max = nums[i];
	}

	for(int i = 0; i<nums.length;i++){
	    if(min>nums[i]) min = nums[i];

	}

	System.out.println(max);
	System.out.println(min);


    }
}
