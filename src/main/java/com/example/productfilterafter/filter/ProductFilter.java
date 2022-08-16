package com.example.productfilterafter.filter;

import com.example.productfilterafter.filter.specification.ProductFilterSpecification;
import com.example.productfilterafter.model.Product;

import java.util.List;

public class ProductFilter {
  private final List<ProductFilterSpecification> productFilters;

  public ProductFilter(List<ProductFilterSpecification> productFilters) {
    this.productFilters = productFilters;
  }

  public List<Product> filterBy(List<Product> products) {
    var filteredList = products;

    for (ProductFilterSpecification filter : productFilters) {
      filteredList = filter.applyFilter(filteredList);
    }

    return filteredList;
  }

}