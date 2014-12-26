package com.lq.fuck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class LoadAndFind extends Contrals {

	/**
	 * 生成用户信息表
	 */
	private int currLocal;
	private InputStream is;

	LoadAndFind() {
		this.currLocal = 0;
	}

	@Override
	public int loadData() {

		String bigString;
		File file = new File("/home/lq/12306.txt");
		byte[] textByte = new byte[(int) file.length()];
		System.out.println("文件长度：" + file.length());
		try {
			is = new FileInputStream(file);
			is.read(textByte, 0, (int) file.length());
			// bigString = textByte.toString();
			// System.out.println(bigString);
			bigString = new String(textByte, "utf-8");
			// System.out.println(bigString);
			String[] stringArray = bigString.split("\n");
			System.out.println(stringArray[0]);
			// this.psn = new Person[stringArray.length];// 数据表初始化
			int count = 0;
			while (count < stringArray.length) {// 继续分割字符串 然后生成对象
				String[] smallString = stringArray[count].split("----");
				this.insertElem(new Person(smallString[0], smallString[1],
						smallString[2], smallString[3], smallString[5]));
				++count;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 这个地方使用map更好，也就是说，整体的数据表采用map会使时间复杂度减低很多哦
	 */
	@Override
	public boolean isFind(String userName) {

		int count = 0;
		while(count<this.psn.size()){
			if(userName.equals(this.psn.elementAt(count).getUserName()))
			{
				return true;
			}
			++count;
		}
		return false;
	}

	public void showPerson(int local)
	{
		System.out.println(this.psn.elementAt(currLocal).toString());
	}
	private void insertElem(Person psn) {
		this.psn.add(psn);
	}
	

}
