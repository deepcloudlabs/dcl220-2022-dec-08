import com.example.stock.repository.StockRepository;
import com.example.stock.repository.inmemory.InmemoryStockRepository;
import com.example.stock.repository.inmemory.JdbcStockRepository;

module com.example.stock {
	exports com.example.stock.domain;
	exports com.example.stock.repository;
	provides StockRepository with InmemoryStockRepository,JdbcStockRepository;
}