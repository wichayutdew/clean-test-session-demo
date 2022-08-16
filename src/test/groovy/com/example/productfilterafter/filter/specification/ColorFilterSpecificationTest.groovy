package com.example.productfilterafter.filter.specification

import com.example.productfilterafter.model.Product
import spock.lang.Specification

class ColorFilterSpecificationTest extends Specification {

  def filterColor = "RED"
  def colorFilterSpecification = new ColorFilterSpecification(filterColor)

  def "should filter correct product given color filter"() {
    given:
    def product1 = Stub(Product) {
      getColor() >> filterColor
    }
    def product2 = Stub(Product) {
      getColor() >> "Other Color"
    }
    def products = [product1, product2]

    when:
    def result = colorFilterSpecification.applyFilter(products)

    then:
    result.size() == 1
    result[0].getColor() == filterColor

  }
}
