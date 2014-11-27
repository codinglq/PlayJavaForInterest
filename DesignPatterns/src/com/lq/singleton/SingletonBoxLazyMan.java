package com.lq.singleton;

/**
 * 懒汉模式，要再给你，OMG.
 * 
 * @author lq
 *
 */
public class SingletonBoxLazyMan {

	private static SingletonBoxLazyMan instance = null;
	private int countTimes = 0;

	private SingletonBoxLazyMan() {
		//System.out.println("加载未启动");
	}

	public synchronized static SingletonBoxLazyMan getInstance() {
		if (null == instance) {
			instance = new SingletonBoxLazyMan();
		}
		if (null != instance) {
			++instance.countTimes;// 引用计数器
		}

		return instance;
	}

	public void showCounter() {
		System.out.println("引用次数:" + this.countTimes);
	}

	public void showMethod() {
		System.out.println("懒汉模式");
	}
}
