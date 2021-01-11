package com.nt.itemDTO;

import java.sql.SQLException;
import java.util.List;

import com.nt.bo.Item;

public interface IItemDTO {
	
	public List<Item> readAllItems() throws SQLException, ClassNotFoundException;
}
