package com.lq.thread;

/**
 * 简单的消费者，每次在缓冲区拿走一个产品，并且打印到屏幕上。
 * 
 * @author lq
 *
 */
public class ExtendsThread extends Thread {

	private Value theValue = null;

	public ExtendsThread(Value instance) {
		super("Producter");
		this.theValue = instance;
	}

	@SuppressWarnings("unused")
	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (theValue) {
				System.out.println(this.getName() + " 消费者获取产品："
						+ theValue.getValue() + " 当前下标"
						+ theValue.getCurrLocal() + " 操作次数："
						+ this.theValue.getTimes());
			}

			//这里使用非锁机制同步共享资源，也就是缓冲区。
			while (true) {

				if (!theValue.isEmpty()) {
					System.out.println(this.getName() + " 消费者获取产品："
							+ theValue.getValue() + " 当前下标"
							+ theValue.getCurrLocal() + " 操作次数："
							+ this.theValue.getTimes());
				} else {
					//使用非锁机制来同步资源。
					yield();
				}
			}
		}
	}
}
