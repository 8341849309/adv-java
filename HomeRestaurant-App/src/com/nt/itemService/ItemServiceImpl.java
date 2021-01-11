package com.nt.itemService;

import java.sql.SQLException;
import java.util.List;

import com.nt.bo.Item;
import com.nt.itemDTO.IItemDTO;
import com.nt.itemDTO.ItemDTOImpl;

public class ItemServiceImpl implements IItemService {

	IItemDTO itemdto=new ItemDTOImpl();
	
	@Override
	public List<Item> getItems() throws Exception {

		System.out.println("ItemServiceImpl.getItems()");
		return itemdto.readAllItems();
	}

}
