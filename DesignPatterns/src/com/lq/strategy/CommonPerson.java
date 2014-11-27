package com.lq.strategy;

public class CommonPerson extends Person {

	public CommonPerson()
	{
		super(new SayChinease(), new EatChinaFood());
	}
}
