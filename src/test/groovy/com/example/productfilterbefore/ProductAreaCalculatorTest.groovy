package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import spock.lang.Specification

class ProductAreaCalculatorTest extends Specification {

  def productAreaCalculator = new ProductAreaCalculator()
  def productForAreaCalculation

  void setup() {
    def product1 = Stub(Product) {
      getWidth() >> 10.00
      getHeight() >> 10.00
      getShape() >> "RECTANGLE"
    }
    def product2 = Stub(Product) {
      getWidth() >> 20.00
      getHeight() >> 20.00
      getShape() >> "RECTANGLE"
    }
    def product3 = Stub(Product) {
      radius >> 10
      getShape() >> "CIRCLE"
    }
    productForAreaCalculation = [product1, product2, product3]
  }

  def "should calculate product area"() {
    given:
    def expectedTotalArea = 814

    when:
    def result = productAreaCalculator.calculateArea(productForAreaCalculation)

    then:
    Math.round(result) == expectedTotalArea
  }
}
