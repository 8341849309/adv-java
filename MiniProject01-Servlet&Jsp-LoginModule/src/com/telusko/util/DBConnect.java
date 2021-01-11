package com.telusko.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	private String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver";
	private String URL;
	private String USERNAME;
	private String PASSWORD;

	private static Connection con = null;

	public DBConnect() throws ClassNotFoundException, SQLException {

		Class.forName(DRIVER_CLASS);

		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	}

	public static Connection getConnection() {
		return con;
	}

}
