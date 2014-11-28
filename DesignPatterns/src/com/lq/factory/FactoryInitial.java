package com.lq.factory;

/**
 * 设计模式之工厂模式 简单工厂，工厂方法，抽象工厂。
 * 
 * @author lq
 *
 */
public class FactoryInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 简单工厂测试
		SimpleFactory simFactory = new SimpleFactory();// 我先来个工厂

		Computer cp1 = simFactory.getObject(1);// 我要个人电脑
		cp1.calculate();

		Computer cp2 = simFactory.getObject(2);// 我要个服务器
		cp2.calculate();

		Computer cp3 = simFactory.getObject(3);// 来个超级计算器玩玩
		cp3.calculate();

		// 工厂方法测试
		PersonFactory psnFactory = new PersonFactory();
		Computer cp4 = psnFactory.makeComputer();
		cp4.calculate();

		ServerFactory serFactory = new ServerFactory();
		Computer cp5 = serFactory.makeComputer();
		cp5.calculate();

		SuperFactory superFactory = new SuperFactory();
		Computer cp6 = superFactory.makeComputer();
		cp6.calculate();
	}

}
