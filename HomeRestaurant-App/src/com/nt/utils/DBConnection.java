package com.nt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection con = null;
	private static String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	private String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private String USERNAME="root";
	private String PASSWORD="root";

	private DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	}

	public static Connection getConnection() {
		return con;
	}

}
