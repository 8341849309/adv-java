package com.nt.itemController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.bo.Item;
import com.nt.itemService.IItemService;
import com.nt.itemService.ItemServiceImpl;

@WebServlet("/ItemController")
public class ItemController extends HttpServlet {

	IItemService itemService = new ItemServiceImpl();
	List<Item> items =null;
	
	@Override
	public void init() throws ServletException {
		System.out.println("items are received...");
		try {
			items = itemService.getItems();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setAttribute("items",items);
		RequestDispatcher rd = req.getRequestDispatcher("items.jsp");
		rd.forward(req, res);
		for (Item item : items) {
			System.out.println(item);
		}
		
		
	}

}
