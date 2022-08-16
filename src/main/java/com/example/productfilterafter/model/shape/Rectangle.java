package com.example.productfilterafter.model.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {
  private double width;
  private double height;

  @Override
  public double getArea() {
    return width * height;
  }
}
