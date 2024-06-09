
package com.linktic.ecommer.ecommerback.domain.port;

import com.linktic.ecommer.ecommerback.domain.model.CategoryRequestDto;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.CategoryEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ICategoryRepository {
    CategoryEntity Save(CategoryEntity product);
    Iterable<CategoryEntity> FindAll();
    CategoryEntity FindById(UUID id);
    void  Delete(UUID id);

}
