package com.lq.factory;
/**
 * 工厂接口，以后所有的工厂都要实现这个接口，并且这个接口中的方法就是真正去创建电脑产品的方法。
 * @author lq
 *
 */
public interface Factory {

	public Computer makeComputer();
}
