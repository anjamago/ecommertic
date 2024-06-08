package com.linktic.ecommer.ecommerback.domain.port;

import com.linktic.ecommer.ecommerback.domain.model.Category;

import java.util.UUID;

public interface ICategoryRepository {
    Category Save(Category product);
    Iterable<Category> FindAll();
    Category FindById(UUID id);
    void  Delete(UUID id);
}
