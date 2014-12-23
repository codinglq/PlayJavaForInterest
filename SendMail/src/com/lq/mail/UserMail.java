package com.lq.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class UserMail implements UserMailInterface {

	String passWord;//邮箱密码
	String smtpHost;// 服务器主机
	String from;// 发送者邮箱
	String to;// 接收者邮箱
	Properties properties;//存贮系统属性
	Session session;//session而已
	

	/**
	 * 后续的还可以更改接收者邮箱
	 * @param userMail
	 * @param passWord
	 * @param to
	 */
	public UserMail(String userMail,String passWord,String smtpHost,String to)
	{//构造函数用来初始化一下属性啥的。
		this.from = userMail;
		this.smtpHost = smtpHost;
		this.passWord = passWord;
		this.to = to;
		this.properties = System.getProperties();
		this.session = Session.getDefaultInstance(properties,
				new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("isiamwall@163.com",
						"asd8956656"); // 发件人邮件用户名、密码
			}
		});
	}
	@Override
	public void setSmtpHost(String host) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFrom(String from) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTo(String to) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTextMessage(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTextSubject(String subject) {
		// TODO Auto-generated method stub

	}

}
