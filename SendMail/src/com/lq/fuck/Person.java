package com.lq.fuck;

public class Person {

	private String userName;
	private String passWord;
	private String reallName;
	private String cadeId;
	private String phoneNumber;

	Person(String name, String word, String reallyName, String cadeId,
			String phone) {
		this.cadeId = cadeId;
		this.passWord = word;
		this.reallName = reallyName;
		this.userName = name;
		this.phoneNumber = phone;
	}

	Person() {

	}

	@Override
	public String toString() {
		return "Person [userName=" + userName + ", passWord=" + passWord
				+ ", reallName=" + reallName + ", cadeId=" + cadeId
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getReallName() {
		return reallName;
	}

	public void setReallName(String reallName) {
		this.reallName = reallName;
	}

	public String getCadeId() {
		return cadeId;
	}

	public void setCadeId(String cadeId) {
		this.cadeId = cadeId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
