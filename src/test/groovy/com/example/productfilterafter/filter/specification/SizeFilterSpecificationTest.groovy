package com.example.productfilterafter.filter.specification

import com.example.productfilterafter.model.Product
import spock.lang.Specification

class SizeFilterSpecificationTest extends Specification {

  def filterSize = "BIG"
  def sizeFilterSpecification = new SizeFilterSpecification(filterSize)

  def "should filter correct product given color filter"() {
    given:
    def product1 = Stub(Product) {
      getSize() >> filterSize
    }
    def product2 = Stub(Product) {
      getSize() >> "Other Size"
    }
    def products = [product1, product2]

    when:
    def result = sizeFilterSpecification.applyFilter(products)

    then:
    result.size() == 1
    result[0].getSize() == filterSize

  }
}
