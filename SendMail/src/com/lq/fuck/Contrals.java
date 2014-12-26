package com.lq.fuck;

import java.util.Vector;

public abstract class Contrals {

	public Vector<Person> psn;// 存储所有的人员数据

	Contrals()
	{
		this.psn = new Vector();
	}
	public abstract int loadData();

	public abstract boolean isFind(String userName);
}
