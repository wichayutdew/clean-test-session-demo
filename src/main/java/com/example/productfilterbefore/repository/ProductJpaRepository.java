package com.example.productfilterbefore.repository;

import com.example.productfilterbefore.model.Product;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductJpaRepository implements IProductRepository{
  private final ProductJpaRepositoryImpl productJpaRepositoryImpl;

  @Override
  public void save(List<Product> products) {
    productJpaRepositoryImpl.save(products);
  }
}
