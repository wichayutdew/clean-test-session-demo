package com.example.productfilterafter.filter

import com.example.productfilterafter.filter.specification.ColorFilterSpecification
import com.example.productfilterafter.filter.specification.SizeFilterSpecification
import com.example.productfilterafter.model.Product
import spock.lang.Specification

class ProductFilterTest extends Specification {

  def redProduct = Stub(Product) {
    getColor() >> "RED"
  }
  def blueProduct = Stub(Product) {
    getColor() >> "BLUE"
  }
  def products = [blueProduct, redProduct]
  def expectedProducts = [redProduct]

  def "should filter correct product when filter given specifications"() {
    given:
    def colorFilter = Stub(ColorFilterSpecification) {
      applyFilter(_ as List<Product>) >> expectedProducts
    }
    def sizeFilter = Stub(SizeFilterSpecification) {
      applyFilter(_ as List<Product>) >> expectedProducts
    }
    def productFilters = [colorFilter, sizeFilter]
    def productFilter = new ProductFilter(productFilters)

    when:
    def result = productFilter.filterBy(products)

    then:
    result.size() == 1
    result[0].getColor() == "RED"
  }
}
