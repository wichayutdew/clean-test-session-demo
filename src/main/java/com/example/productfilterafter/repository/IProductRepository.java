package com.example.productfilterafter.repository;

import com.example.productfilterafter.model.Product;

import java.util.List;

public interface IProductRepository {

  void saveProduct(List<Product> products);
}
