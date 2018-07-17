package com.paoim.coredemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class EmailSchedular {

	public void sendEmailVeryOneMinute() {
		//execute every 1 minutes
		sendEmail(60 * 1000);
	}

	public void sendEmailVeryOneHour() {
		//execute every 1 hour
		sendEmail(60 * 60 * 1000);
	}
	
	public void sendEveryDayMorningAtSix() {
		Date now = new Date();
		Date dateToBackup = null;
		Timer timer = new Timer();
		Calendar date = Calendar.getInstance();
		DateFormat sdfNow = new SimpleDateFormat("MMMM-dd-yyyy");
		DateFormat sdf = new SimpleDateFormat("MMMM-dd-yyyy hh:mm aaa");
		
		String atSixAm = sdfNow.format(now) + " 06:10 AM";//Push to send at 6:10 AM
		try {
			dateToBackup = sdf.parse(atSixAm);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateToBackup);
		date.set(Calendar.HOUR, calendar.get(Calendar.HOUR));
		date.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE));
		date.set(Calendar.SECOND, calendar.get(Calendar.SECOND));
		date.set(Calendar.MILLISECOND, 0);
		
		// Schedule to run every day
		System.out.println("Start generate on: " + date.getTime());
		timer.scheduleAtFixedRate(new SchedulerTask(), date.getTime(), 1000 * 60 * 60 * 24);
	}
	
	private void sendEmail(long delay) {
		Timer timer = new Timer();
		Calendar date = Calendar.getInstance();
		
		//Setting the date from when you want to activate scheduling
		//date.set(2015, 10, 5, 14, 37);
		date.set(2015, 10, 5);
		System.out.println(date.getTime());
		
		//execute every delay in seconds
		timer.schedule(new SchedulerTask(), date.getTime(), delay);
	}
}