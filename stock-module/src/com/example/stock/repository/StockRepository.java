package com.example.stock.repository;

import java.util.List;
import java.util.Optional;

import com.example.stock.domain.Stock;

public interface StockRepository {
	Optional<Stock> findStockById(int productId);

	List<Stock> findStockByPage(int page, int size);

	void addStock(Stock product);

	void updateStock(Stock product);

	Optional<Stock> removeStock(int productId);
}
