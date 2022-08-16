package com.example.productfilterafter.service;

import com.example.productfilterafter.filter.ProductFilter;
import com.example.productfilterafter.model.Product;
import com.example.productfilterafter.repository.IProductRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductService {

  private final ProductFilter productFilter;
  private final IProductRepository productRepository;

  public void process(List<Product> products) {
    var filteredProducts = productFilter.filterBy(products);

    productRepository.saveProduct(filteredProducts);
  }
}
