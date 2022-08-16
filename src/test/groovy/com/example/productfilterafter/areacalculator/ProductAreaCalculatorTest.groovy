package com.example.productfilterafter.areacalculator

import com.example.productfilterafter.model.Product
import spock.lang.Specification

class ProductAreaCalculatorTest extends Specification {

  def productAreaCalculator = new ProductAreaCalculator()

  def "should calculate products area"() {
    given:
    def product1 = Stub(Product) {getArea() >> 100}
    def product2 = Stub(Product) {getArea() >> 100}
    def products = [product1, product2]

    when:
    def result = productAreaCalculator.calculateArea(products)

    then:
    result == 200
  }
}
