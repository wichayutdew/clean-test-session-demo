package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import com.example.productfilterbefore.repository.ProductJpaRepositoryImpl
import spock.lang.Specification

class ProductServiceTest extends Specification {

  def productFactory = Mock(ProductFactory)
  def productJpaRepositoryImpl = Mock(ProductJpaRepositoryImpl)
  def productService = new ProductService(productFactory, productJpaRepositoryImpl)
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
    1 * productFactory.filter(products, _ as String, _ as String) >> filteredProducts
    1 * productJpaRepositoryImpl.save(filteredProducts)
  }
}
