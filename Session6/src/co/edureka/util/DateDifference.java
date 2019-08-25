package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDifference {

	public static void main(String[] args) {
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		String date1 = "15-08-2019";
		String date2 = "25-08-2019";
		
		try {
			Date dRef1 = myFormat.parse(date1);
			Date dRef2 = myFormat.parse(date2);
			
			System.out.println(">> dRef1: "+dRef1);
			System.out.println(">> dRef2: "+dRef2);
			
			long difference = dRef2.getTime() - dRef1.getTime();
			
			System.out.println(">> difference is: "+difference); // MilliSeconds :)
			
			long days = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
			System.out.println(">> days is: "+days);
			
		}catch (Exception e) {
			System.out.println(">> Some Error: "+e);
		}
				
		

	}

}
