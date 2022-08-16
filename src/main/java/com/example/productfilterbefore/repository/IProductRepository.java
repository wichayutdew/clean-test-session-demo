package com.example.productfilterbefore.repository;

import com.example.productfilterbefore.model.Product;

import java.util.List;

public interface IProductRepository {
  void save(List<Product> products);
}
