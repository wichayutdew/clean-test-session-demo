package com.example.productfilterbefore;

import com.example.productfilterbefore.model.Product;
import com.example.productfilterbefore.repository.IProductRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductService {

  private final ProductFilter productFilter;
  private final IProductRepository productRepository;

  public void process(List<Product> products) {
    List<Product> filteredProducts = productFilter.filter(products, "RED", "SIZE");

    productRepository.save(filteredProducts);
  }
}
