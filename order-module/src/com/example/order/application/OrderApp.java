package com.example.order.application;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

import com.example.order.domain.Order;
import com.example.order.domain.OrderItem;
import com.example.order.service.business.StandardOrderService;
import com.example.product.repository.ProductRepository;
import com.example.stock.domain.Repository;
import com.example.stock.domain.RepositoryType;
import com.example.stock.repository.StockRepository;

public class OrderApp {

	public static void main(String[] args) {
		var orderService = new StandardOrderService();
		ServiceLoader<ProductRepository> productRepositories = 
				  ServiceLoader.load(ProductRepository.class);
		ServiceLoader<StockRepository> stockRepositories = 
				ServiceLoader.load(StockRepository.class);
		StockRepository stockRepository = 
		stockRepositories.stream()
						 .map(Provider::get)
		                 .filter(repository->repository.getClass().getAnnotation(Repository.class).value() == RepositoryType.JDBC)
		                 .peek(repository -> System.err.println(repository.getClass()))
		                 .findFirst()
		                 .get();  
		orderService.setProductRepository(productRepositories.findFirst().get());
		orderService.setStockRepository(stockRepository);
		var order = new Order(1,List.of(new OrderItem(1, 2),new OrderItem(2, 3)));
		orderService.receiveOrder(order);
		orderService.purchase(order);
	}

}
