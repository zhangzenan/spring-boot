package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.domain.Stock;
import cn.itcast.mapper.StockMapper;
import cn.itcast.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	// 注入Mapper接口代理对象
	@Autowired
	private StockMapper stockMapper;

	@Override
	public List<Stock> findAll() {
		List<Stock> list = stockMapper.findAll();
		return list;
	}

	@Override
	public Stock getStockById(Integer id) {
		Stock stock= stockMapper.getStockById(id);
		return stock;
	}

}
