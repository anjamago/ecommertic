package com.linktic.ecommer.ecommerback.infrastructure.Adapter;

import com.linktic.ecommer.ecommerback.domain.port.IProductRepository;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ProductCrudRepository implements IProductRepository {

    private final  IProductCrudRepository _productCrudRepository;

    public ProductCrudRepository(IProductCrudRepository productCrudRepository) {
        _productCrudRepository = productCrudRepository;
    }

    @Override
    public ProductEntity Save(ProductEntity product) {
        return _productCrudRepository.save(product);
    }

    @Override
    public Iterable<ProductEntity> FindAll() {
        return _productCrudRepository.findAll();
    }

    @Override
    public ProductEntity FindById(UUID id) {
        return _productCrudRepository.findById(id).orElseThrow(()->new RuntimeException(
                "Product with id [%s] not found ".formatted(id)
        ));
    }

    @Override
    public void Delete(UUID id) {
        _productCrudRepository.deleteById(id);
    }
}
