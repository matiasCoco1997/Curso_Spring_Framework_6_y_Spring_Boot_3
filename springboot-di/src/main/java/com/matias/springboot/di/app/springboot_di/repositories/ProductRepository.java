package com.matias.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.matias.springboot.di.app.springboot_di.models.Product;

public class ProductRepository implements IProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L,"Zapatillas Nike", 300L),
            new Product(2L,"Remera Adidas", 400L),
            new Product(3L,"Pantalon Puma", 500L) ,       
            new Product(4L,"Gorra Umbro", 600L)       
        );
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id){
        Product product = data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        return product;
    }

}
