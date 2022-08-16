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
    given:
    def expectedProductAmount = 1
    def expectedProductName = "BIG RED PRODUCT"

    when:
    def result = productFactory.filter(products, "RED", "BIG")

    then:
    result.size() == expectedProductAmount
    result[0].getName() == expectedProductName
  }

  def "should calculate product area"() {
    given:
    def expectedTotalArea = 814

    when:
    def result = productFactory.calculateArea(products)

    then:
    Math.round(result) == expectedTotalArea
  }
}
