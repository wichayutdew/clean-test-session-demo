package com.example.productfilterbefore.model;

public class Circle implements Shape{
  public double radius;
  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius,2);
  }
}
