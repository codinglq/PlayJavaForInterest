package com.lq.factory;

public class ServerComputer extends Computer {

	public ServerComputer() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("组装网络服务器");
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("网络服务器的计算能力较强");
	}

}
