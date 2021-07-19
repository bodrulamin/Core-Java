class ArrayAvg{
    public static void main(String[] args){

	double[] arr = {3,5,6,324,56,7,86,};

	double sum = 0;
	int length = arr.length;

	for(int i = 0; i <length; i++){
	    sum += arr[i];
	}	

	double avg = sum/arr.length;
	System.out.println("The avg is " + avg );



    }	

}

