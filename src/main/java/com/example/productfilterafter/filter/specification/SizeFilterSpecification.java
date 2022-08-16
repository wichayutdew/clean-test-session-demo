package com.example.productfilterafter.filter.specification;

import com.example.productfilterafter.model.Product;

import java.util.ArrayList;
import java.util.List;

public class SizeFilterSpecification implements ProductFilterSpecification {
  private final String size;

  public SizeFilterSpecification(String size) {
    this.size = size;
  }

  @Override
  public List<Product> applyFilter(List<Product> products) {
    List<Product> filteredList = new ArrayList<>();

    for (Product product : products) {
      if (size.equals(product.getSize())) {
        filteredList.add(product);
      }
    }

    return filteredList;
  }
}
