package com.linktic.ecommer.ecommerback.application;

import com.linktic.ecommer.ecommerback.domain.mapper.CategoryMapper;
import com.linktic.ecommer.ecommerback.domain.model.CategoryReponseDto;
import com.linktic.ecommer.ecommerback.domain.model.CategoryRequestDto;
import com.linktic.ecommer.ecommerback.domain.port.ICategoryRepository;

import java.util.List;
import java.util.UUID;


public class CategoryService {
    private  final ICategoryRepository _categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        _categoryRepository = categoryRepository;
    }

    public CategoryReponseDto createCategory(CategoryRequestDto category) {

        var entity = CategoryMapper.mapToCategoryEntity(category);
        var data =  _categoryRepository.Save(entity);
        return CategoryMapper.mapToCategoryDto(data);
    }

    public List<CategoryReponseDto> getAllCategories() {
        var categorys = _categoryRepository.FindAll();
        return CategoryMapper.mapToCategoryDtoList(categorys);
    }

    public CategoryReponseDto getFiindCategory(UUID categoryId) {
        var entity = _categoryRepository.FindById(categoryId);
        return CategoryMapper.mapToCategoryDto(entity);
    }

    public void deleteCategory(UUID categoryId) {
         _categoryRepository.Delete(categoryId);
    }

}
