package com.lq.factory;
/**
 * 服务器电脑工厂
 * @author lq
 *
 */
public class ServerFactory implements Factory {

	@Override
	public Computer makeComputer() {

		return new ServerComputer();
		// TODO Auto-generated method stub
	}

}
