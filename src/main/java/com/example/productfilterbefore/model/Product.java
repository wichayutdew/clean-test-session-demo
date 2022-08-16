package com.example.productfilterbefore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
  public String color;
  public String size;
  public String name;
  public Double width;
  public Double height;
  public Double radius;
  public String shape;
}