package com.linktic.ecommer.ecommerback.infrastructure.Adapter;

import com.linktic.ecommer.ecommerback.infrastructure.Entitys.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IProductCrudRepository extends CrudRepository<ProductEntity, UUID> {
}
