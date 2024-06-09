package com.linktic.ecommer.ecommerback.domain.mapper;

import com.linktic.ecommer.ecommerback.domain.model.CategoryReponseDto;
import com.linktic.ecommer.ecommerback.domain.model.CategoryRequestDto;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.CategoryEntity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CategoryMapper {

    public static CategoryReponseDto mapToCategoryDto(CategoryEntity entity) {
        return new CategoryReponseDto(
                entity.getIdCategoy(),
                entity.getName()
        );
    }

    public static  CategoryEntity mapToCategoryEntity(CategoryRequestDto dto) {
        return new CategoryEntity(
                dto.name()
        );
    }

    public static List<CategoryReponseDto> mapToCategoryDtoList(Iterable<CategoryEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(CategoryMapper::mapToCategoryDto)
                .collect(Collectors.toList());
    }
}
