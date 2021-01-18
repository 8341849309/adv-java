package com.nt.service;

import com.nt.dao.AdminDAOImpl;
import com.nt.dao.IAdminDAO;

public class AdminServiceImpl implements IAdminService {

	private IAdminDAO dao = new AdminDAOImpl();
	
	@Override
	public boolean adminExists(String username, String password) throws Exception {
		
		System.out.println("AdminServiceImpl.adminExists() called...");
		return dao.checkAdminById(username, password);
	}

}
