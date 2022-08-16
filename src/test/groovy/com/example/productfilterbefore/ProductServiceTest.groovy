package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import com.example.productfilterbefore.productfilter.ProductFilter
import com.example.productfilterbefore.repository.IProductRepository
import spock.lang.Specification

class ProductServiceTest extends Specification {

  def productFilter = Mock(ProductFilter)
  def productRepository = Mock(IProductRepository)
  def productService = new ProductService(productFilter, productRepository)
  def product
  def products

  void setup() {
    product = Stub(Product)
    products = [product, product, product, product]
  }

  def "should filter and save products when process"() {
    given:
    def filteredProducts = [product, product]

    when:
    productService.process(products)

    then:
    1 * productFilter.filter(products, _ as String, _ as String) >> filteredProducts
    1 * productRepository.save(filteredProducts)
  }
}
