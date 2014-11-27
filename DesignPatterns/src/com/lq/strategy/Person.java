package com.lq.strategy;

public class Person {

	private int age;
	private String name;
	private int id;
	private boolean sex;// false为女士true为男士
	
	private SayStrategy sayMethod;
	private EatStrategy eatMtehod;
	
	public Person(SayStrategy theSayMethod,EatStrategy theEatMethod)
	{//使用构造函数注入方法
		this.sayMethod = theSayMethod;
		this.eatMtehod = theEatMethod;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	/**
	 * 吃方法和手滑方法
	 */
	
	public void eat()
	{
		this.eatMtehod.personEat();
	}
	
	public void say()
	{
		this.sayMethod.personSay();
	}
}
