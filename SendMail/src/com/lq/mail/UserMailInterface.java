package com.lq.mail;

public interface UserMailInterface {

	void setSmtpHost(String host);// 设置smtp主机地址

	void setFrom(String from);// 设置发出的邮箱

	void setTo(String to);// 设置接收邮件的邮箱

	void setTextMessage(String message);// 设置邮件内容

	void setTextSubject(String subject);// 设置邮件主题
}
