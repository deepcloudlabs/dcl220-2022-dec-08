package com.example.product.repository.inmemory;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.example.product.domain.Product;
import com.example.product.repository.ProductRepository;

public class InmemoryProductRepository implements ProductRepository {
	private Map<Integer, Product> products = new ConcurrentHashMap<>();
	{
		products.put(1, new Product(1, "pencil", "pencil", null, 10));
		products.put(2, new Product(2, "pen", "pen", null, 6));
	}
	@Override
	public Optional<Product> findProductById(int productId) {
		return Optional.ofNullable(products.get(productId));
	}

	@Override
	public List<Product> findProductByPage(int page, int size) {
		return products.values().stream().skip(page * size).limit(size).toList();
	}

	@Override
	public void addProduct(Product product) {
		products.putIfAbsent(product.productId(), product);
	}

	@Override
	public void updateProduct(Product product) {
		if (products.containsKey(product.productId())) {
			products.put(product.productId(), product);
		}
	}

	@Override
	public Optional<Product> removeProduct(int productId) {
		return Optional.ofNullable(products.remove(productId));
	}

}
