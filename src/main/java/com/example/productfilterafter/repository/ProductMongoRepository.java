package com.example.productfilterafter.repository;

import com.example.productfilterafter.model.Product;

import java.util.List;

public class ProductMongoRepository implements IProductRepository {

  // Mongo ORM Implementation as dependency
  // private final ProductMongoRepositoryImpl productMongoRepositoryImpl;

  @Override
  public void saveProduct(List<Product> products) {
    // productMongoRepositoryImpl.persist(products);
  }
}
