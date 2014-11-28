package com.lq.factory;

/**
 * 超级计算机工厂
 * @author lq
 *
 */
public class SuperFactory implements Factory {

	@Override
	public Computer makeComputer() {
		return new SuperComputer();
	}

}
