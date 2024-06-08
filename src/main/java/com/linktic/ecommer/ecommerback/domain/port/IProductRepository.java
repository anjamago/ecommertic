package com.linktic.ecommer.ecommerback.domain.port;

import com.linktic.ecommer.ecommerback.domain.model.Product;

import java.util.UUID;

public interface IProductRepository {
    Product Save(Product product);
    Iterable<Product> FindAll();
    Product FindById(UUID id);
    void  Delete(UUID id);
}
