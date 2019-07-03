package com.tyss.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.tyss.jdbcapp.ConnectionPoolTest;
import com.tyss.jdbcapp.PropertyUtil;

public class ConnectionPool {

	/*
	 * private static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/db";
	 * private static final String JDBC_USER = "root"; private static final String
	 * JDBC_PASS = "root"; private static final int POOL_SIZE = 10;
	 */

	private static ConnectionPool poolRef = null;
	Connection con = null;
	private String url;
	private String user;
	private String pwd;
	private int poolSize;

	ArrayList<Connection> pool = new ArrayList<>();

	public static ConnectionPool getConnectionPoolTest() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;

	}

	private void loadPropertyFileDetail() throws Exception {
		url = PropertyUtil.getPropertyUtil().getProperty("url");
		user = PropertyUtil.getPropertyUtil().getProperty("user");
		pwd = PropertyUtil.getPropertyUtil().getProperty("pass");
		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty("size"));
	}

	private void initPool() throws SQLException {
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(url, user, pwd);
			pool.add(con);
		}
	}

	public ConnectionPool() throws Exception {
		loadPropertyFileDetail();
		initPool();
		// End of for
	}// End of constructor

	public Connection getConnectionFromPool() {
		// Connection connection=pool.get(0);
		return pool.remove(0);
	}

	public void returnConnectionToPool(Connection con) {
		pool.add(con);
	}
}// End of class
