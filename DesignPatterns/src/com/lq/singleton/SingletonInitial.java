package com.lq.singleton;

/**
 * 单例模式，先来个懒汉和饿汉模式尝尝鲜.
 * 
 * @author lq
 *
 */
public class SingletonInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonBox box1 = SingletonBox.getInstance();
		SingletonBox box2 = SingletonBox.getInstance();
		
		//box1.showMethod();
		System.out.println("饿汉模式"+ (box1==box2? "成功生成唯一单例":"单例创建失败"));
		
		SingletonBoxLazyMan box3 = SingletonBoxLazyMan.getInstance();
		SingletonBoxLazyMan box4 = SingletonBoxLazyMan.getInstance();
		SingletonBoxLazyMan box5 = SingletonBoxLazyMan.getInstance();
		
		System.out.println("懒汉模式"+ (box3==box4? "成功生成唯一单例":"单例创建失败"));
		box2.showCounter();
		box2.showMethod();
		box3.showCounter();
		box3.showMethod();
	}
}
