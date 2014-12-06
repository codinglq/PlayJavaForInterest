package com.lq.thread;
/**
 * 使用CAS的多线程测试，能不用锁就不用锁，使用原子操作。
 * @author lq
 *
 */
public class CASInitial {

	public static void main(String[] args) {

		ProduceBuffer pf = new ProduceBuffer();
//		for (int i = 0; i < 10; i++) {
//			pf.setProduce(i);
//			System.out.println(i);
//		}
//		System.out.println("------------------");
//		for (int i = 0; i < 10; i++) {
//			System.out.println(pf.getProduce());
//		}
		
		ProduceMaker pm = new ProduceMaker(pf, "生产者线程");
		ProduceMaker pm1 = new ProduceMaker(pf, "生产者线程");
		
		ProduceReader pr = new ProduceReader(pf, "消费者线程-1");
		ProduceReader pr1 = new ProduceReader(pf, "消费者线程-2");
		
		pm1.start();
		pm.start();
		pr.start();
		pr1.start();
		
		try {
			pm1.join();
		} catch (InterruptedException e3) {
			e3.printStackTrace();
		}
		
		try {
			pr1.join();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		
		try {
			pm.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			pr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
