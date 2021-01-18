package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOImpl implements IAdminDAO {

	private Connection con=null;
	private PreparedStatement ps=null;
	
	/*
	 *This method returns true if username and password exists in ADMIN table 
	 */
	String CHECK_ADMIN_DETAILS="SELECT * FROM ADMIN WHERE ADMINUSERNAME=? AND ADMINPASSWORD=?";
	@Override
	public boolean checkAdminById(String username,String password) throws ClassNotFoundException, SQLException  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "root");
		
		ps = con.prepareStatement(CHECK_ADMIN_DETAILS);
		ps.setNString(1, username);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		boolean result = rs.next();

		System.out.println("Checking in DataBase..."+result);
		return result;
	}

}
