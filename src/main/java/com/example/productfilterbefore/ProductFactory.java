package com.example.productfilterbefore;

import com.example.productfilterbefore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

  public List<Product> filter(List<Product> products, String color, String size) {
    var filteredList = new ArrayList<Product>();

    for (Product product : products) {
      if (color.equals(product.color) && size.equals(product.size)) {
        filteredList.add(product);
      }
    }
    return filteredList;
  }

  public double calculateArea(List<Product> products) {
    var totalArea = 0.00;
    for (Product product : products) {
      if ("RECTANGLE".equals(product.shape)) {
        totalArea += (product.width * product.height);
      } else {
        totalArea += (Math.PI * Math.pow(product.radius, 2));
      }
    }
    return totalArea;
  }

}
