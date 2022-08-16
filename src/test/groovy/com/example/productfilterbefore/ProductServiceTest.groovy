package com.example.productfilterbefore

import com.example.productfilterbefore.model.Product
import com.example.productfilterbefore.repository.ProductJpaRepositoryImpl
import spock.lang.Specification

class ProductServiceTest extends Specification {

  def productFactory = Mock(ProductFactory)
  def productJpaRepositoryImpl = Mock(ProductJpaRepositoryImpl)
  def productService = new ProductService(productFactory, productJpaRepositoryImpl)

  def products = List.of(
      new Product("RED", "BIG", "BIG RED PRODUCT",10.00, 10.00,null, "RECTANGLE"),
      new Product("YELLOW", "BIG", "BIG YELLOW PRODUCT",10.00, 10.00,null, "RECTANGLE"),
      new Product("BLUE", "SMALL", "SMALL BLUE PRODUCT",10.00, 10.00,null, "RECTANGLE"),
      new Product("RED", "MEDIUM", "MEDIUM RED PRODUCT",10.00, 10.00,null, "RECTANGLE"))

  def filteredProducts = List.of(
      new Product("RED", "BIG", "BIG RED PRODUCT",10.00, 10.00,null, "RECTANGLE"),
      new Product("RED", "MEDIUM", "MEDIUM RED PRODUCT",10.00, 10.00,null, "RECTANGLE"))

  def "should filter and save products when process"() {
    when:
    productService.process(products)

    then:
    1 * productFactory.filter(products, _ as String, _ as String) >> filteredProducts
    1 * productJpaRepositoryImpl.save(filteredProducts)
  }
}
