package com.pao.coredemo;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {

	public static void main(String[] args) {
		final String username = "noreplyriitrackingissue@gmail.com";
		final String password = "riitrackingissue";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		System.out.println("Properties........");

		Session session = Session.getInstance(props,
		new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		System.out.println("Session........");

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("noreplyriitrackingissue@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("noreplyriitrackingissue@gmail.com"));
			message.setSubject("Test to send email by Gmail");
			message.setText("Dear User," + "\n\n No spam to my email, please!");
			System.out.println("Start to send........");
			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
		//References:
		//1. https://java.net/projects/javamail/pages/Home#Development_Releases
		//2. http://www.mkyong.com/java/javamail-api-sending-email-via-gmail-smtp-example/
		//3. https://developers.google.com/gmail/oauth_overview?hl=en#protocol
		//4. https://community.oracle.com/thread/1455136?start=0&tstart=0
	}

}
