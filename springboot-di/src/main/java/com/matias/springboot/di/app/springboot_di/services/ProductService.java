package com.matias.springboot.di.app.springboot_di.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.matias.springboot.di.app.springboot_di.models.Product;
import com.matias.springboot.di.app.springboot_di.repositories.ProductRepository;

@Component
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.25d;
            //Product newProduct = new Product(p.getId(), p.getName(), priceTax.longValue());
            Product newProduct = (Product)p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).toList();
    }

    public Product findById(Long id){
        return productRepository.findById(id);
    }

}
