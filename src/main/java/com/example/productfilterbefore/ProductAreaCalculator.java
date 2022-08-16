package com.example.productfilterbefore;

import com.example.productfilterbefore.model.Product;

import java.util.List;

public class ProductAreaCalculator {

  public double calculateArea(List<Product> products) {
    var totalArea = 0.00;
    for (Product product : products) {
      totalArea += product.getArea();
    }
    return totalArea;
  }

}
