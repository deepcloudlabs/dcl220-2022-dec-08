package com.example.stock.repository.inmemory;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.example.stock.domain.Repository;
import com.example.stock.domain.RepositoryType;
import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;

@Repository(RepositoryType.IN_MEMORY)
public class InmemoryStockRepository implements StockRepository {
	private Map<Integer, Stock> stocks = new ConcurrentHashMap<>();

	{
		stocks.put(1, new Stock(1, 10));
		stocks.put(2, new Stock(2, 10));
	}
	
	@Override
	public Optional<Stock> findStockById(int productId) {
		return Optional.ofNullable(stocks.get(productId));
	}

	@Override
	public List<Stock> findStockByPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStock(Stock product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStock(Stock stock) {
		if (stocks.containsKey(stock.productId())) {
			stocks.put(stock.productId(), stock);
		}

	}

	@Override
	public Optional<Stock> removeStock(int productId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
