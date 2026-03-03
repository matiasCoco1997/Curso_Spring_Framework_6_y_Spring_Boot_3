package com.matias.springboot.di.app.springboot_di.services;

import java.util.List;

import com.matias.springboot.di.app.springboot_di.models.Product;
import com.matias.springboot.di.app.springboot_di.repositories.ProductRepository;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            //Product newProduct = new Product(p.getId(), p.getName(), priceTax.longValue());
            //return newProduct;
            Product newProduct = (Product)p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).toList();
    }

    public Product findById(Long id){
        return productRepository.findById(id);
    }

}
