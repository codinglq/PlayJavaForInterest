package com.lq.thread;

import java.util.concurrent.atomic.*;

/**
 * 这个缓冲区采用的原子操作来保证线程安全，但是貌似还是不安全啊。
 * 
 * @author lq
 *
 */
public class ProduceBuffer {

	private int times = 0;
	private int length = 0;// 缓冲区元素个数最大值
	private AtomicIntegerArray value = null;// 下标计数器。

	private AtomicInteger currLocal = new AtomicInteger(0);// 原子数组下标也是0开始的吧？

	public ProduceBuffer(int length) {
		// 简简单单的初始化一下
		this.length = length;
		this.value = new AtomicIntegerArray(this.length);
	}

	public ProduceBuffer() {
		// 简简单单的初始化一下
		this.length = 10;
		this.value = new AtomicIntegerArray(this.length);
		System.out.println(this.value.toString());
	}

	// 向缓冲区中添加商品。
	public void setProduce(int theValue) {
		// 注意保持原子性
		++this.times;
		if (this.length > this.currLocal.get()) {
			while (true) {
				int oldValue = this.currLocal.get();
				if (this.currLocal.compareAndSet(oldValue, oldValue)) {
					this.value.getAndSet(currLocal.getAndIncrement(), theValue);
					return;
				}
			}
		}
	}

	// 从缓冲区中取走商品。
	public int getProduce() {
		// 注意保持原子性
		++this.times;
		if (this.currLocal.get() >= 1) {
			while (true) {
				int oldValue = this.currLocal.get();
				if (this.currLocal.compareAndSet(oldValue, oldValue)) {
					return this.value.get(currLocal.decrementAndGet());
				}
			}
		}
		return -1;
	}
	
	public int getTimes()
	{
		return this.times;
	}
}
