package com.tyss.jdbcapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;


public class ConnectionPoolTest {

	private static ConnectionPoolTest poolRef;
	Connection con = null;
	private String url;
	private String user;
	private String pwd;
	private int poolSize;

	private static Vector<Connection> pool = new Vector<>();

	public static ConnectionPoolTest getConnectionPoolTest() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPoolTest();
		}
		return poolRef;

	}
	 
	private void loadPropertyFileDetail() throws Exception {
		url = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstant.URL);
		user = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstant.USER);
		pwd = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstant.PWD);
		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstant.POOL_SIZE));
	}

	private void initPool() throws SQLException {
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(url, user, pwd);
			pool.add(con);
		}
	}
	private ConnectionPoolTest() throws Exception {
		loadPropertyFileDetail();
		initPool();
		 // End of for
	}// End of constructor

	public static Connection getConnectionFromPool() {
		// Connection connection=pool.get(0);
		return pool.remove(0);
	}

	public static void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
}// End of class
