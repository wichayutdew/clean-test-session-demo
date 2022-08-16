package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import com.example.productfilterbefore.productfilter.ColorFilterSpecification
import com.example.productfilterbefore.productfilter.ProductFilter
import spock.lang.Specification

class ProductFilterTest extends Specification {

  def productsForColorFilter

  void setup() {
    productsForColorFilter = [Stub(Product),Stub(Product),Stub(Product)]
  }

  def "should filter product according to the result of filter specification"() {
    given:
    def expectedFilteredProducts = List.of(Stub(Product) {
      getName() >> "BIG RED PRODUCT"
    })
    def colorFilterSpecification = Stub(ColorFilterSpecification) {
      applyFilter(_ as List<Product>) >> expectedFilteredProducts
    }

    def productFilterSpecifications = List.of(colorFilterSpecification)
    def productFilter = new ProductFilter(productFilterSpecifications)

    when:
    def result = productFilter.filter(productsForColorFilter)

    then:
    result.size() == expectedFilteredProducts.size()
    result[0].getName() == expectedFilteredProducts.get(0).getName()
  }
}