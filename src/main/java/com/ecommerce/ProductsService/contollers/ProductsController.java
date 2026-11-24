package com.ecommerce.ProductsService.contollers;

import com.ecommerce.ProductsService.models.Product;
import com.ecommerce.ProductsService.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {
    public ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/helloworld")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable("productId") long productId){
        Product product = productService.getProductById(productId);
        return product;
    }
}
