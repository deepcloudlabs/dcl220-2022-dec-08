package com.example.order.service.business;

import java.util.List;

import com.example.order.domain.Order;
import com.example.order.domain.OrderItem;
import com.example.order.service.OrderService;
import com.example.product.repository.ProductRepository;
import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;

public class StandardOrderService implements OrderService {
	private StockRepository stockRepository;
	private ProductRepository productRepository;
	
	public void setStockRepository(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<OrderItem> receiveOrder(Order order) {
		var itemsInStock = order.items().stream()
		             .filter( item -> {
		            	 var stock = stockRepository.findStockById(item.productId());
		            	 return stock.isPresent() && stock.get().quantity() >= item.quantity();
		             }).toList();
		if (itemsInStock.size() == order.items().size()) {
			itemsInStock.forEach(item->{
				var stock = stockRepository.findStockById(item.productId()).get();
				var newStock = new Stock(item.productId(), stock.quantity()-item.quantity());
				stockRepository.updateStock(newStock);
			});
		}
		return itemsInStock;
	}
	@Override
	public boolean purchase(Order order) {
		var totalOrderSum =
		order.items().stream()
		             .mapToDouble(item -> 
		                 productRepository.findProductById(item.productId()).get().price() * item.quantity())
		             .sum(); 
		System.out.println("Receiving %f \u20BA...".formatted(totalOrderSum));
		return true;
	}

}
