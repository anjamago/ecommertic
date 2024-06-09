package com.linktic.ecommer.ecommerback.infrastructure.Adapter;

import com.linktic.ecommer.ecommerback.domain.port.ICategoryRepository;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class CategoryCrudRepository implements ICategoryRepository {

    private final ICategoryCrudRepository _categoryCrudRepository;

    @Autowired
    public CategoryCrudRepository(ICategoryCrudRepository categoryCrudRepository) {
        _categoryCrudRepository = categoryCrudRepository;
    }


    @Override
    public CategoryEntity Save(CategoryEntity category) {
        return  _categoryCrudRepository.save(category);

    }

    @Override
    public Iterable<CategoryEntity> FindAll() {
        return  _categoryCrudRepository.findAll();
    }

    @Override
    public CategoryEntity FindById(UUID id) {
        return _categoryCrudRepository.findById(id).orElseThrow(()-> new RuntimeException(
                "Category  with id  [%s] not found".formatted(id)
        ));
    }

    @Override
    public void Delete(UUID id) {
        _categoryCrudRepository.deleteById(id);
    }
}
