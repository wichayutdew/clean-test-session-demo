package com.example.productfilterbefore.model;

public class Triangle implements Shape{
  public double width;
  public double height;
  @Override
  public double getArea() {
    return width * height / 2;
  }
}
