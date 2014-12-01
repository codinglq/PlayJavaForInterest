package com.lq.mysql;
/**
 * 数据库连接池简单版
 * @author lq
 *
 */
public class ConnectionPoolInitial {

	public static void main(String[] args) {
		
		/**
		 * 臃肿的测试
		 */
		DbConnection dbcon = new DbConnection("127.0.0.1", "3306", "test", "root", "123456");
		DbConnection.showResult(dbcon.getResultQuery("select * from the_table"));
		dbcon.closeConnection();
		System.gc();//神奇的垃圾回收啊！
		//测试结束
	}

}
