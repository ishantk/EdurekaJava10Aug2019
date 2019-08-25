package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAPI {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(">> Its: "+date); // Current Date Time Stamp of Local System
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		String dateStamp1 = format1.format(date);
		
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm:ss");
		String dateStamp2 = format2.format(date);
		
		SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/YY hh:mm:ss");
		String dateStamp3 = format3.format(date);
		
		System.out.println(">> dateStamp1 is: "+dateStamp1);
		System.out.println(">> dateStamp2 is: "+dateStamp2);
		System.out.println(">> dateStamp3 is: "+dateStamp3);
		
		Calendar calendar = Calendar.getInstance();
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(">> dd is: "+dd);
		System.out.println(">> hh is: "+hh);
		
	}

}
