package com.ecommerce.ProductsService.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends Base{
    private String title;
    private String description;
    private Long qty;
    private Double price;
    private String imageUrl;
    private Category category;
}
