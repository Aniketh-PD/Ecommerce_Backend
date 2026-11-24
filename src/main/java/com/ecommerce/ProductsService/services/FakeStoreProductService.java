package com.ecommerce.ProductsService.services;

import com.ecommerce.ProductsService.dtos.FakeStoreProductdto;
import com.ecommerce.ProductsService.models.Category;
import com.ecommerce.ProductsService.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    RestClient restClient;

    public FakeStoreProductService(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public Product getProductById(Long id) {
        ResponseEntity<FakeStoreProductdto> fakeStoreProduct = restClient.get()
                .uri("/products/{id}",id)
                .retrieve()
                .toEntity(FakeStoreProductdto.class);

        FakeStoreProductdto fakeStoreProductdto = fakeStoreProduct.getBody();

        Product product = convertToProductFromFakestoreProductDto(fakeStoreProductdto);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    private Product convertToProductFromFakestoreProductDto(FakeStoreProductdto fakeStoreProductdto) {
        if(fakeStoreProductdto == null) return null;
        Product product = new Product();
        product.setId(fakeStoreProductdto.getId());
        product.setTitle(fakeStoreProductdto.getTitle());
        product.setDescription(fakeStoreProductdto.getDescription());
        product.setPrice(fakeStoreProductdto.getPrice());
        product.setImageUrl(fakeStoreProductdto.getImage());
        Category category = new Category();
        category.setDescription(fakeStoreProductdto.getCategory());
        product.setCategory(category);
        return product;
    }
}
