package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import spock.lang.Specification

class ProductFactoryTest extends Specification {

  def productFactory = new ProductFactory()
  def productsForColorFilter
  def productForAreaCalculation

  void setup() {
    def product1 = Stub(Product) {
      color >> "RED"
      size >> "BIG"
      name >> "BIG RED PRODUCT"
    }
    def product2 = Stub(Product) {
      color >> "BLUE"
      size >> "SMALL"
      name >> "SMALL BLUE PRODUCT"
    }
    def product3 = Stub(Product) {
      color >> "RED"
      size >> "MEDIUM"
      name >> "MEDIUM RED PRODUCT"
    }
    productsForColorFilter = [product1, product2, product3]

    def product4 = Stub(Product) {
      width >> 10.00
      height >> 10.00
      shape >> "RECTANGLE"
    }
    def product5 = Stub(Product) {
      width >> 20.00
      height >> 20.00
      shape >> "RECTANGLE"
    }
    def product6 = Stub(Product) {
      radius >> 10
      shape >> "CIRCLE"
    }
    productForAreaCalculation = [product4, product5, product6]
  }

  def "should filter product by red color"() {
    given:
    def expectedProductAmount = 1
    def expectedProductName = "BIG RED PRODUCT"

    when:
    def result = productFactory.filter(productsForColorFilter, "RED", "BIG")

    then:
    result.size() == expectedProductAmount
    result[0].getName() == expectedProductName
  }

  def "should calculate product area"() {
    given:
    def expectedTotalArea = 814

    when:
    def result = productFactory.calculateArea(productForAreaCalculation)

    then:
    Math.round(result) == expectedTotalArea
  }
}
