package com.lq.thread;

/**
 * 简单的生产者，每次生产一个产品，上到缓冲区。
 * 
 * @author lq
 *
 */
public class Maker extends Thread {
	private Value theValue = null;

	public Maker(Value instance) {
		super("Maker");
		this.theValue = instance;
	}

	@SuppressWarnings("unused")
	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (theValue) {// 获取这个对象的锁。
				int temp = (int) (Math.random() * 10000);
				System.out.println(this.getName() + " 生产者生产的产品：" + temp
						+ " 当前下标" + theValue.getCurrLocal() + " 操作次数："
						+ this.theValue.getTimes());
				theValue.setValue(temp);
			}

			// 使用非锁机制做到同步。
			while (true) {
				if (this.theValue.isInsted()) {
					int temp = (int) (Math.random() * 100);
					System.out.println(this.getName() + " 生产者生产的产品：" + temp
							+ " 当前下标" + theValue.getCurrLocal() + " 操作次数："
							+ this.theValue.getTimes());
					theValue.setValue(temp);
				} else {
					yield();
				}
			}
		}
	}
}
