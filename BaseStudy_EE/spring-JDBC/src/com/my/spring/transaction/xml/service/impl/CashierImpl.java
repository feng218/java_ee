package com.my.spring.transaction.xml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.my.spring.transaction.xml.service.BookShopService;
import com.my.spring.transaction.xml.service.Cashier;


public class CashierImpl implements Cashier
{
	
	private BookShopService bookShopService;
	
	public void setBookShopService(BookShopService bookShopService)
	{
		this.bookShopService = bookShopService;
	}
	
	@Override
	public void checkout(String username, List<String> isbns)
	{
		for(String isbn : isbns)
		{
			bookShopService.purchase(username, isbn);
		}
	}

}
