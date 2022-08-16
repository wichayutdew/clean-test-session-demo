package com.example.productfilterafter.model;

import com.example.productfilterafter.model.shape.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
  public String color;
  public String size;
  public String name;
  public Shape shape;

  public double getArea() {
    return shape.getArea();
  }
}
