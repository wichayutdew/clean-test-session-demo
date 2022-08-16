package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import spock.lang.Specification

class ProductFilterTest extends Specification {

  def productFilter = new ProductFilter()
  def productsForColorFilter

  void setup() {
    def product1 = Stub(Product) {
      getColor() >> "RED"
      getSize() >> "BIG"
      getName() >> "BIG RED PRODUCT"
    }
    def product2 = Stub(Product) {
      getColor() >> "BLUE"
      getSize() >> "SMALL"
      getName() >> "SMALL BLUE PRODUCT"
    }
    def product3 = Stub(Product) {
      getColor() >> "RED"
      getSize() >> "MEDIUM"
      getName() >> "MEDIUM RED PRODUCT"
    }
    productsForColorFilter = [product1, product2, product3]
  }

  def "should filter product by red color"() {
    given:
    def expectedProductAmount = 1
    def expectedProductName = "BIG RED PRODUCT"

    when:
    def result = productFilter.filter(productsForColorFilter, "RED", "BIG")

    then:
    result.size() == expectedProductAmount
    result[0].getName() == expectedProductName

  }
}