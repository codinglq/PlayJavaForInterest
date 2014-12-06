package com.lq.thread;

public class ProduceMaker extends Thread {

	private ProduceBuffer pf = null;

	public ProduceMaker(ProduceBuffer pf, String threadName) {
		super(threadName);
		this.pf = pf;
	}

	public void run() {

		while(true){
		int temp = (int)(Math.random()*100);
		this.pf.setProduce(temp);
		yield();
		}
	}
}
