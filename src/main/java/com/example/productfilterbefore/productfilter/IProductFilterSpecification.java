package com.example.productfilterbefore.productfilter;

import com.example.productfilterbefore.model.Product;

import java.util.List;

public interface IProductFilterSpecification {
  List<Product> applyFilter(List<Product> products);
}
