package com.lq.factory;

/**
 * 个人电脑工厂
 * @author lq
 *
 */
public class PersonFactory implements Factory {

	@Override
	public Computer makeComputer() {
		// TODO Auto-generated method stub
		return new PersonComputer();
	}

}
