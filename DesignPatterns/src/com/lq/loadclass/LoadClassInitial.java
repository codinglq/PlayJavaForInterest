package com.lq.loadclass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * javc使用class.forname方式加载类，这不就是c语言中的动态链接库是一个玩意吗？
 * 动态加载类，配合着设计模式，然后就可以在不改变客户端代码的情况下就能添加新的功能，
 * 做到了一套代码，无限扩充功能，差不多这样吧。
 * @author lq
 *
 */
public class LoadClassInitial {

	public static void main(String[] args) {

		Class c1 = String.class;
		String str = new String();
		Class c2 = str.getClass();
		
		try {
			Class c3 = Class.forName("java.lang.String");
			String str1 = (String)c1.newInstance();
			String str2 = (String)c2.newInstance();
			String str3 = (String)c3.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		Method []mth1 = c1.getMethods();
		
		for (Method method : mth1) {
			System.out.println(method);
		}
		System.out.println("获取成员变量：");
		Field []fd = c1.getFields();
		
		for (Field field : fd) {
			System.out.println(field);
		}
	}

}
