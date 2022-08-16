package com.example.productfilterbefore.productfilter;

import com.example.productfilterbefore.model.Product;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductFilter {

  private final List<IProductFilterSpecification> productFilterSpecifications;

  public List<Product> filter(List<Product> products) {
    var filteredList = products;

    for (IProductFilterSpecification productFilterSpecification : productFilterSpecifications) {
      filteredList = productFilterSpecification.applyFilter(products);
    }
    return filteredList;
  }
}
