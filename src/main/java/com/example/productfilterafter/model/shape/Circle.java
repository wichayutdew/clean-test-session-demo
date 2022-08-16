package com.example.productfilterafter.model.shape;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
  private double radius;

  @Override
  public double getArea() {
    return Math.pow(radius, 2) * Math.PI;
  }
}
