package com.lq.factory;

/**
 * 这个是简单工厂，通过用户传入的参数，进行对象的建造！
 * 
 * @author lq
 *
 */
public class SimpleFactory {

	public  Computer getObject(int what) {
		switch (what) {
		case 1://组装个人电脑
			return new PersonComputer();
		case 2://组装服务器
			return new ServerComputer();
		case 3://组装超级计算机
			return new SuperComputer();
		}

		return null;
	}
}
