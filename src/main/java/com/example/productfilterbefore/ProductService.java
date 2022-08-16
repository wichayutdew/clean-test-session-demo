package com.example.productfilterbefore;

import com.example.productfilterbefore.model.Product;
import com.example.productfilterbefore.repository.ProductJpaRepositoryImpl;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductService {

  private final ProductFactory productFactory;
  private final ProductJpaRepositoryImpl productJpaRepositoryImpl;

  public void process(List<Product> products) {
    List<Product> filteredProducts = productFactory.filter(products, "RED", "SIZE");

    productJpaRepositoryImpl.save(filteredProducts);
  }
}
