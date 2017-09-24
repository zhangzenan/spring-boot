package cn.itcast.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.itcast.domain.Stock;

@Mapper
public interface StockMapper {
	public List<Stock> findAll();
	
	public Stock getStockById(Integer id);

}
