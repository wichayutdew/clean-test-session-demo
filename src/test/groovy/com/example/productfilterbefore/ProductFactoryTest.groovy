package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import spock.lang.Specification

class ProductFactoryTest extends Specification {

  def productFactory = new ProductFactory()

  def "should filter product by red color"() {
    given:
    def products = List.of(
        new Product("RED", "BIG", "BIG RED PRODUCT", 10, 10, null, "Rectangle"),
        new Product("BLUE", "SMALL", "SMALL BLUE PRODUCT", 20, 20, null, "Triangle"),
        new Product("RED", "MEDIUM", "MEDIUM RED PRODUCT", null, null, 10, "Circle"))

    when:
    def result = productFactory.filter(products, "RED", "BIG")

    then:
    result.size() == 1
    result[0].getName() == "BIG RED PRODUCT"
  }

  def "should calculate product area"() {
    given:
    def products = List.of(
        new Product("RED", "BIG", "BIG RED PRODUCT",10.00, 10.00,null, "RECTANGLE"),
        new Product("RED", "BIG", "BIG RED PRODUCT",null,null,10.00, "CIRCLE"))

    when:
    def result = productFactory.calculateArea(products)

    then:
    Math.round(result) == 414
  }
}
