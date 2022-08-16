package com.example.productfilterafter.areacalculator;

import com.example.productfilterafter.model.Product;

import java.util.List;

public class ProductAreaCalculator {
  public double calculateArea(List<Product> products) {
    var totalArea = 0;
    for (Product product : products) {
      totalArea += product.getArea();
    }
    return totalArea;
  }
}
