package com.example.productfilterafter.service

import com.example.productfilterafter.filter.ProductFilter
import com.example.productfilterafter.model.Product
import com.example.productfilterafter.repository.IProductRepository
import spock.lang.Specification

class ProductServiceTest extends Specification {

  def productFilter = Mock(ProductFilter)
  def productRepository = Mock(IProductRepository)
  def productService = new ProductService(productFilter, productRepository)

  def product = Mock(Product)
  def products = [product, product, product]
  def filteredProducts = [product, product]

  def "should filter and save product when process"() {
    when:
    productService.process(products)

    then:
    1 * productFilter.filterBy(products) >> filteredProducts
    1 * productRepository.saveProduct(filteredProducts)
  }
}
