package com.example.productfilterbefore.model;

public class Rectangle implements Shape{
  public double width;
  public double height;
  @Override
  public double getArea() {
    return width * height;
  }
}
