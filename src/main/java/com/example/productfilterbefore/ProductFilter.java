package com.example.productfilterbefore;

import com.example.productfilterbefore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {

  public List<Product> filter(List<Product> products, String color, String size) {
    var filteredList = new ArrayList<Product>();

    for (Product product : products) {
      if (color.equals(product.getColor()) && size.equals(product.getSize())) {
        filteredList.add(product);
      }
    }
    return filteredList;
  }
}
