package com.ecommerce.ProductsService.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category extends  Base{
    private String name;
    private String description;
}
