package com.linktic.ecommer.ecommerback.application;

import com.linktic.ecommer.ecommerback.domain.mapper.ProductMapper;
import com.linktic.ecommer.ecommerback.domain.model.ProductRequestDto;
import com.linktic.ecommer.ecommerback.domain.model.ProductResponseDto;
import com.linktic.ecommer.ecommerback.domain.port.IProductRepository;

import java.util.List;
import java.util.UUID;

public class ProductService {
    private  final IProductRepository _productRepository;
    public ProductService(IProductRepository productRepository) {
        _productRepository = productRepository;
    }

    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) {
        var entity = ProductMapper.mapToEntity(productRequestDto);
        var data =  _productRepository.Save(entity);
        return ProductMapper.mapToDto(data);
    }


    public void  deleteProduct(UUID productId) {
        _productRepository.Delete(productId);
    }
    public List<ProductResponseDto> getAllProducts() {
        var products =  _productRepository.FindAll();
        return ProductMapper.mapToDtoList(products);
    }

    public ProductResponseDto getProductById(UUID productId) {
        var entity = _productRepository.FindById(productId);
        return ProductMapper.mapToDto(entity);
    }
}
