package com.example.productfilterbefore.repository;

import com.example.productfilterbefore.model.Product;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductMongoRepository implements IProductRepository{
  private final ProductMongoRepositoryImpl productMongoRepositoryImpl;
  @Override
  public void save(List<Product> products) {
    productMongoRepositoryImpl.persist(products);
  }
}
