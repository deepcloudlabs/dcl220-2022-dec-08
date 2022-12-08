import com.example.product.repository.ProductRepository;
import com.example.stock.repository.StockRepository;

module com.example.order {
	requires com.example.stock;
	requires com.example.product;
	uses StockRepository;
	uses ProductRepository;
}