package com.ecommerce.ProductsService.services;

import com.ecommerce.ProductsService.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product updateProduct(Long id,Product product);

    Product addProduct(Product product);

    void deleteProduct(Long id);
}
