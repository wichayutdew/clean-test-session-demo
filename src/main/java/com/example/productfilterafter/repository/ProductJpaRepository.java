package com.example.productfilterafter.repository;

import com.example.productfilterafter.model.Product;

import java.util.List;

public class ProductJpaRepository implements IProductRepository {

  // Jpa ORM Implementation as dependency
  // private final ProductJpaRepositoryImpl productJpaRepositoryImpl;

  @Override
  public void saveProduct(List<Product> products) {
    // productJpaRepositoryImpl.save(products);
  }

}
