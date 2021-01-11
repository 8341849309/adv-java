package com.nt.itemDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.bo.Item;
import com.nt.utils.DBConnection;

public class ItemDTOImpl implements IItemDTO {

	String READ_ALL_ITEMS = "SELECT *FROM ITEM";

	@Override
	public List<Item> readAllItems() throws SQLException, ClassNotFoundException {

		List<Item> items = new ArrayList<Item>();

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "root", "root");
		PreparedStatement st = con.prepareStatement(READ_ALL_ITEMS);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Item item = new Item();
			item.setItemNo(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setBasePrice(rs.getFloat(3));
			item.setMRP(rs.getFloat(4));
			item.setDescription(rs.getString(5));

			items.add(item);
		}

		System.out.println("ItemDTOImpl.readAllItems()");
		return items;
	}

}
