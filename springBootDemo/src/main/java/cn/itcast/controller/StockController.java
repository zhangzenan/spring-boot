package cn.itcast.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.domain.Stock;
import cn.itcast.service.StockService;

@RestController
@RequestMapping("api")
public class StockController {
	// 注入Service对象
	@Autowired
	private StockService stockService;

	@RequestMapping("stock")
	public List<Stock> findAll() {
		List<Stock> list = stockService.findAll();
		return list;
	}

	@RequestMapping(value = "stock/{id}", method = RequestMethod.GET)
	public Stock getStockById(@PathVariable("id") Integer id) {
		if (id == 0) {
			return new Stock();
		}
		Stock stock = stockService.getStockById(id);
		List<String> categories = new ArrayList<String>();
		categories.add("互联网");
		categories.add("金融");
		stock.setCategories(categories);
		return stock;
	}
}
