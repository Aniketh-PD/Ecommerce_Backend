package com.ecommerce.ProductsService.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Base {
    private Long Id;
    private Date createdAt;
    private Date lastUpdatedAt;
}
