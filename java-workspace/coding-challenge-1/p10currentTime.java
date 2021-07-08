import java.util.Date;
import java.text.SimpleDateFormat;
class p10currentTime{
	public static void main(String[] args){
		Date date = new Date();

		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String time = f.format(date);

		System.out.println(time);
		
	}	

}

