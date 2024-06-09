package com.linktic.ecommer.ecommerback.domain.mapper;

import com.linktic.ecommer.ecommerback.domain.model.ProductRequestDto;
import com.linktic.ecommer.ecommerback.domain.model.ProductResponseDto;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProductMapper {

    public static ProductResponseDto mapToDto(ProductEntity entity) {
        return new ProductResponseDto(
                entity.getProductId(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getQuantity(),
                entity.getCode(),
                entity.getImageUrl(),
                entity.getUserId(),
                entity.getCategoryId()
        );
    }

    public static List<ProductResponseDto> mapToDtoList(Iterable<ProductEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(ProductMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public static ProductEntity mapToEntity(ProductRequestDto dto) {
        return new ProductEntity(
               dto.Quantity(),
                dto.Price(),
                dto.Name(),
                dto.ImageUrl(),
                dto.Description(),
                dto.Code(),
                dto.CategoryId(),
                dto.UserId()
        );
    }
}
