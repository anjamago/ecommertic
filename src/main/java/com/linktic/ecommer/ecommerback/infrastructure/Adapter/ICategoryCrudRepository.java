package com.linktic.ecommer.ecommerback.infrastructure.Adapter;

import com.linktic.ecommer.ecommerback.infrastructure.Entitys.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, UUID> {
}
