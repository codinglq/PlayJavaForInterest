package com.lq.singleton;


/**
 * 饿汉模式
 * 出现，就加载！！！浪费资源
 * 这个应该本身就是线程安全的，因为不论线程怎么并发，都不会创建多个实例。是这样吗？
 * @author lq
 *
 */
public class SingletonBox {

	/**
	 * foo......
	 */
	//private static SingletonBox instance = null;
	private SingletonBox()
	{
		//私有化，不让别人创建
	}
	
	private int countTimes = 0;
	private static SingletonBox instance = new SingletonBox();

	public static SingletonBox getInstance() {
		++instance.countTimes;//引用计数器
		return instance;
	}
	
	public void showCounter()
	{
		System.out.println("引用次数:"+this.countTimes);
	}
	public void showMethod()
	{
		System.out.println("饿汉模式");
	}
}
