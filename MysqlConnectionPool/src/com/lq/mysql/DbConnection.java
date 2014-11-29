package com.lq.mysql;

import java.sql.*;

/**
 * 数据库连接类，完成功能：根据输入的参数创造一个数据库连接，查询。
 * 用批判的思想看代码！
 * @author lq
 *
 */
public class DbConnection {

	//完全没有面向对象的设计？这叫封装？
	private String host = null;
	private String userName = null;
	private String passWord = null;
	private String dbName = null;
	private String url = null;
	private Connection con = null;
	private String port = null;
	private Statement st = null;

	/**
	 * 简简单单的初始化一下
	 * 
	 * @param theHost
	 * @param theDbName
	 * @param theUserName
	 * @param thePassWord
	 */
	public DbConnection(String theHost, String thePort, String theDbName,
			String theUserName, String thePassWord) {
		//关于数据库的初始化都写在构造函数里面好吗？不感觉这样可配置性很低吗？
		this.dbName = theDbName;
		this.host = theHost;
		this.userName = theUserName;
		this.passWord = thePassWord;
		this.port = thePort;

		this.url = "jdbc:mysql://" + this.host + ":" + this.port + "/"
				+ this.dbName;
		// 数据配置结束

		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection(url, this.userName,
					this.passWord);

			this.st = con.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 提供一个静态方法来显示结果集，调试使用。
	 * @param res
	 */
	public static void showResult(ResultSet res)
	{
		try {
			 int col = res.getMetaData().getColumnCount() + 1;
			 while (res.next()) {
			 for (int i = 1; i < col; i++) {
			 System.out.println(res.getString(i) + "\t");
			 }
			 System.out.println();
			 }
			 } catch (Exception e) {
			 e.printStackTrace();
			 }
	}

	/**
	 * 执行带有结果集的查询
	 * 
	 * @param sql
	 * @return
	 */
	public ResultSet getResultQuery(String sql) {
		//仅仅就是封装了一下查询方法而已，这样有什么优势可言吗？
		try {
			return st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 执行数据库更新语句
	 * 
	 * @param sql
	 * @return
	 */
	public int updateQuery(String sql) {
		//是否可以将有结果集的查询方法和无结果集的查询方法放到一起，成为一个方法，然后通过多台去搞定呢？
		try {
			return this.st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public void closeConnection()
	{
		try {
			this.st.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//get方法就不要get出来密码行不？
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUserName() {
		return userName;
	}

}
