package com.pao.coredemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

public class SchedulerTask extends TimerTask {

	private EmailUtil sendEmail;
	
	public SchedulerTask() {
		this.sendEmail = new EmailUtil();
		
		this.sendEmail.setUsername("noreplyriitrackingissue@gmail.com");
		this.sendEmail.setPassword("riitrackingissue");
		this.sendEmail.setSendFrom("noreplyriitrackingissue@gmail.com");
		this.sendEmail.setSendTo("noreplyriitrackingissue@gmail.com");
		this.sendEmail.setSubject("Testing Email sending....");
		this.sendEmail.setBody("Hi, \n\n this is testing email. \n No spam to my email, please!");
	}
	
	@Override
	public void run() {
		Date now = new Date();
		Date dateToBackup = null;
		DateFormat sdf = new SimpleDateFormat("MMMM-dd-yyyy hh:mm aaa");
		try {
			dateToBackup = sdf.parse(sdf.format(now));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateToBackup);
		
		System.out.println("Sending on: " + sdf.format(now));
		System.out.println("Hour: " + calendar.get(Calendar.HOUR));
		
		if (calendar.get( Calendar.AM_PM ) == 0) {
			if (calendar.get(Calendar.HOUR) == 6) {
				sendEmail.sendMailTLS();
				System.out.println("Task is running on: " + new Date());
			}
		}
	}

}
