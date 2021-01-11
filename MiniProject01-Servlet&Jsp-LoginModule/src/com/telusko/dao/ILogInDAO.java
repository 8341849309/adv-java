package com.telusko.dao;

import com.telusko.bo.LogInBO;

public interface ILogInDAO {

	public LogInBO getLoginDetails(LogInBO bo) throws Exception;
	
}
