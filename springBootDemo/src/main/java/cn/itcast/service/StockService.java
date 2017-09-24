package cn.itcast.service;

import java.util.List;

import cn.itcast.domain.Stock;


public interface StockService {
	public List<Stock> findAll();
	
	public Stock getStockById(Integer id);
}
