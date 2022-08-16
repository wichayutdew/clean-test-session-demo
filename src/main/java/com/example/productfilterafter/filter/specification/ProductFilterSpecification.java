package com.example.productfilterafter.filter.specification;

import com.example.productfilterafter.model.Product;

import java.util.List;

public interface ProductFilterSpecification {
  List<Product> applyFilter(List<Product> products);
}