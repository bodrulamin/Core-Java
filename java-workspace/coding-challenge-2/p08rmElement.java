import java.util.Arrays;
import java.util.Scanner;
class p08rmElement{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int[] nums = {20,25,32,40,90,49};

	System.out.println(Arrays.toString(nums));

	System.out.println("Enter index to delete element");

	int index = sc.nextInt();

	int[] temp = new int[nums.length-1];
	int length = index;
	for(int i = 0; i <length; i++){
		temp[i] = nums[i];
	System.out.println(i);
	}	
	
	for(int i = index+1; i <nums.length; i++){
	System.out.println(i);

		temp[i-1] = nums[i];
	}	

	System.out.println(Arrays.toString(temp));


    }
}
