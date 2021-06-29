class ShowTime{
	public static void main(String[] args){
		// totalmilli seconds
		long totalMilliSeconds = System.currentTimeMillis();

		//total seconds
		long totalSeconds = totalMilliSeconds/1000;

		// miniute ber korar por oboshisto seconds
		// needed
		long currentSecond = totalSeconds % 60;

		//total minutes
		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;
 		
		// total hours
		long totalHours = totalMinutes /60;

		//
		long currentHour = totalHours % 24;


		System.out.println(currentHour + ":" +currentMinute + ":"+ currentSecond);
			
		byte abyte ;
		System.out.println((short)abyte);

		
	}


}
