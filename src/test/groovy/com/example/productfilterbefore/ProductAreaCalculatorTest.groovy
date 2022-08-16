package com.example.productfilterbefore

import com.example.productfilterbefore.model.Circle
import com.example.productfilterbefore.model.Product
import com.example.productfilterbefore.model.Rectangle
import com.example.productfilterbefore.model.Triangle
import spock.lang.Specification

class ProductAreaCalculatorTest extends Specification {

  def productAreaCalculator = new ProductAreaCalculator()
  def productForAreaCalculation

  void setup() {
    def product1 = Stub(Product) {
      shape >> Stub(Rectangle) {
        getArea() >> 100
      }
    }
    def product2 = Stub(Product) {
      shape >> Stub(Triangle) {
        getArea() >> 400
      }
    }
    def product3 = Stub(Product) {
      shape >> Stub(Circle) {
        getArea() >> 314
      }
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
