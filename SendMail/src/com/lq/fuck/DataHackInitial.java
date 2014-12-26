package com.lq.fuck;
/**
 * 12306被搞了。
 * @author lq
 *
 */
public class DataHackInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadAndFind lf = new LoadAndFind();
		lf.loadData();
		lf.showPerson(1);
		lf.showPerson(100);
		System.out.println(lf.isFind("274667266@qq.com"));
	}

}
