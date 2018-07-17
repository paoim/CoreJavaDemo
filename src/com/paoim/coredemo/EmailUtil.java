package com.paoim.coredemo;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
	
	private String username;
	
	private String password;
	
	private String sendTo;
	
	private String sendFrom;
	
	private String subject;
	
	private String body;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	
	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void sendMailTLS() {
		long start = System.currentTimeMillis();
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sendFrom));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(sendTo));
			message.setSubject(subject);
			message.setText(body);
			System.out.println("Message Configure to send........");
			
			Transport.send(message);
			long end = System.currentTimeMillis();
			System.out.println("Send successfully......");
			System.out.println("Took : " + ((end - start) / 1000));

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void sendMailSSL() {
		long start = System.currentTimeMillis();
		Properties props = new Properties();
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
		new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sendFrom));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(sendTo));
			message.setSubject(subject);
			message.setText(body);
			System.out.println("Message Configure to send........");
			
			Transport.send(message);
			long end = System.currentTimeMillis();
			System.out.println("Send successfully......");
			System.out.println("Took : " + ((end - start) / 1000));
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
