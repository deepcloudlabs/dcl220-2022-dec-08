import com.example.product.repository.ProductRepository;
import com.example.product.repository.inmemory.InmemoryProductRepository;

module com.example.product {
	exports com.example.product.repository;
	exports com.example.product.domain;
	provides ProductRepository with InmemoryProductRepository;
}