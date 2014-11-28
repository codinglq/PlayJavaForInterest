package com.lq.factory;

public class PersonComputer extends Computer {

	
	public PersonComputer()
	{
		super();
		System.out.println("组装个人电脑");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("个人电脑计算能力较弱");
	}
}
