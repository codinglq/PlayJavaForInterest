package com.lq.thread;

public class ImpRunnable implements Runnable {

	@Override
	public void run() {
		//这个算是回调函数吧？
		while (true) {
			System.out.println("子线程中呢");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
