package com.lq.thread;

/**
 * 模拟生产者消费者问题，这个value类里面是装在产品的，thevalue数组装在产品 每次生产者生产一个产品，就会放到这个数组中，然后下标加一
 * 每次消费者在这个数组中取走一个产品时候，就下标减一
 * 
 * @author lq
 *
 */
public class Value {

	private int[] theValue = null;
	private volatile int currLocal = 0;
	private volatile int times = 0;

	public Value(int in) {
		this.theValue = new int[in];
		this.currLocal = 0;
	}

	// 可以对访问器加上同步 就是加上synchronized关键字，如果其有线程获取锁且正在执行需要同步的代码段时候
	// 其他线程要想访问数据就会被阻塞。就是说当前对象只有一把锁，被别人拿走了，就无法打开门，只有等待别的线程将这把锁还回来，才能打开门进去修改数据。
	public synchronized void setValue(int in) {

		//这个地方有问题.
		if (this.currLocal < theValue.length && this.currLocal >= 0) {
			theValue[this.currLocal++] = in;
			++(this.times);
		}else{
			System.out.println("缓冲区满了");
		}
	}

	// 消费者获取商品
	public synchronized int getValue() {
		//这个地方也有问题。
		if (this.currLocal <= theValue.length && this.currLocal > 0) {
			++(this.times);
			return theValue[--this.currLocal];
		}
		return 0;
	}

	/**
	 * 添加非同步方法，自己搞定同步。
	 */
	
	/**
	 * 判断是否可以插入。
	 * 
	 * @return
	 */
	public  synchronized boolean isInsted() {
		return this.currLocal < theValue.length;
	}

	/**
	 * 判断是否是空的。
	 * 
	 * @return
	 */
	public  synchronized boolean isEmpty() {
		return this.currLocal < 0;
	}
	
	/**
	 * 获取当前下标。
	 * @return
	 */
	public synchronized int getCurrLocal()
	{
		return this.currLocal;
	}
	
	/**
	 * 查看操作次数。
	 */
	public synchronized int getTimes()
	{
		return this.times;
	}
}
