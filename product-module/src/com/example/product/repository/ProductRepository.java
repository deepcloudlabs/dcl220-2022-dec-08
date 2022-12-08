package com.example.product.repository;

import java.util.List;
import java.util.Optional;

import com.example.product.domain.Product;

public interface ProductRepository {
	Optional<Product> findProductById(int productId);

	List<Product> findProductByPage(int page, int size);

	void addProduct(Product product);

	void updateProduct(Product product);

	Optional<Product> removeProduct(int productId);
}
