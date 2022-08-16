package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import spock.lang.Specification

class ProductFactoryTest extends Specification {

  def productFactory = new ProductFactory()
  def products

  void setup() {
    products = List.of(
        new Product("RED", "BIG", "BIG RED PRODUCT", 10.00, 10.00, null, "RECTANGLE"),
        new Product("BLUE", "SMALL", "SMALL BLUE PRODUCT", 20.00, 20, null, "RECTANGLE"),
        new Product("RED", "MEDIUM", "MEDIUM RED PRODUCT", null, null, 10, "CIRCLE"))
  }

  def "should filter product by red color"() {
    when:
    def result = productFactory.filter(products, "RED", "BIG")

    then:
    result.size() == 1
    result[0].getName() == "BIG RED PRODUCT"
  }

  def "should calculate product area"() {
    when:
    def result = productFactory.calculateArea(products)

    then:
    Math.round(result) == 814
  }
}
