package com.telusko.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.telusko.bo.LogInBO;
import com.telusko.util.DBConnect;

public class LogInDAOImpl implements ILogInDAO {

	String LOGIN_SELECT_QUERY="SELECT * FROM LOGIN WHERE USERNAME=?";
	@Override
	public LogInBO getLoginDetails(LogInBO bo) throws Exception {
		
		Connection con = DBConnect.getConnection();
		PreparedStatement ps = con.prepareStatement(LOGIN_SELECT_QUERY);
		ps.setString(1, bo.getUsername());
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
			bo.setPassword(rs.getString(2));
		
		return null;
	}

}
