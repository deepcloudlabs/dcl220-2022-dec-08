package com.example.stock.repository.inmemory;

import java.util.List;
import java.util.Optional;

import com.example.stock.domain.Repository;
import com.example.stock.domain.RepositoryType;
import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;

@Repository(RepositoryType.JDBC)
public class JdbcStockRepository implements StockRepository {

	@Override
	public Optional<Stock> findStockById(int productId) {
		// TODO Auto-generated method stub
		return Optional.empty();
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
	public void updateStock(Stock product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Stock> removeStock(int productId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
