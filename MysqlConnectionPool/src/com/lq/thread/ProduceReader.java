package com.lq.thread;

public class ProduceReader extends Thread {

	private ProduceBuffer pf = null;

	public ProduceReader(ProduceBuffer pf, String threadName) {
		super(threadName);
		this.pf = pf;
	}

	public void run() {
		while (true) {
			System.out.println(this.pf.getProduce()+this.getName()+" 操作总次数:"+pf.getTimes());
			yield();
		}
	}
}
