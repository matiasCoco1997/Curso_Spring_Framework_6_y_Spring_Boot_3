package com.matias.springboot.di.app.springboot_di.repositories;

import java.util.Collections;
import java.util.List;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.matias.springboot.di.app.springboot_di.models.Product;

//@Primary -> Da prioridad a este @Repository por lo que lo deja por defecto esta implementación, solo puede haber una sola implementación @Primary
@Repository
public class ProductRepositoryFoo implements IProductRepository{

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "Monitor", 600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Monitor", 600L);
    }

}
