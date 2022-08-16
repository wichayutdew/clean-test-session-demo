package com.example.productfilterafter.filter.specification;

import com.example.productfilterafter.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ColorFilterSpecification implements ProductFilterSpecification {
  private final String productColor;

  public ColorFilterSpecification(String productColor) {
    this.productColor = productColor;
  }

  @Override
  public List<Product> applyFilter(List<Product> products) {
    List<Product> filteredProducts = new ArrayList<>();

    for (Product product : products) {
      if (product.getColor().equals(productColor)) {
        filteredProducts.add(product);
      }
    }

    return filteredProducts;
  }
}