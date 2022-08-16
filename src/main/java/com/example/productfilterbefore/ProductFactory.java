package com.example.productfilterbefore;

import com.example.productfilterbefore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

  public List<Product> filter(List<Product> products, String color, String size) {
    var filteredList = new ArrayList<Product>();

    for (Product product : products) {
      if (color.equals(product.getColor()) && size.equals(product.getSize())) {
        filteredList.add(product);
      }
    }
    return filteredList;
  }

  public double calculateArea(List<Product> products) {
    var totalArea = 0.00;
    for (Product product : products) {
      if ("RECTANGLE".equals(product.getShape())) {
        totalArea += (product.getWidth()* product.getHeight());
      } else {
        totalArea += (Math.PI * Math.pow(product.getRadius(), 2));
      }
    }
    return totalArea;
  }

}
