
package com.linktic.ecommer.ecommerback.domain.port;

import com.linktic.ecommer.ecommerback.infrastructure.Entitys.ProductEntity;

import java.util.UUID;

public interface IProductRepository {
    ProductEntity Save(ProductEntity product);
    Iterable<ProductEntity> FindAll();
    ProductEntity FindById(UUID id);
    void  Delete(UUID id);

}
