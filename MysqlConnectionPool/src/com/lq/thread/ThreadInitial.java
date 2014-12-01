package com.lq.thread;

import java.lang.Thread;

/**
 * java多线程
 * 
 * @author lq
 *
 */
public class ThreadInitial {

	public static void main(String[] args) {

		Value theValue = new Value(100000);
		Thread th1 = new ExtendsThread(theValue);
		Thread th2 = new Maker(theValue);

		th2.start();
		th1.start();

		try {
			th1.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// StringBuffer sb = new StringBuffer("a");
		// ThreadInitial.cat(sb);
		// // 输出sb
		// System.out.println(sb);
		//
		// Integer value = new Integer(10);
		// Integer temp = value;
		// System.out.println(value == temp);
		// System.out.println("hash" + value.hashCode());
		// value = 10;
		// System.out.println("hash" + value.hashCode());
		//
		// System.out.println(value == temp);
		// System.out.println(value.equals(temp));
		//
		// ThreadInitial.add(value);
		// System.out.println(value);
		//
		// String str = new String("a");
		// ThreadInitial.cat(str);
		// System.out.println(str);
	}

	public static void cat(String theStr) {
		theStr = new String("b");
	}

	public static void add(Integer theValue) {
		System.out.println(theValue);
		theValue = 100;
	}

	public static void cat(StringBuffer theSb) {
		theSb.append("b");
	}
}
