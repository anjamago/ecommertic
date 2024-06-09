package com.linktic.ecommer.ecommerback.infrastructure.Api;


import com.linktic.ecommer.ecommerback.application.ProductService;
import com.linktic.ecommer.ecommerback.domain.model.ProductRequestDto;
import com.linktic.ecommer.ecommerback.domain.model.ProductResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private  final ProductService _productService;

    public ProductController(ProductService productService) {
        _productService = productService;
    }


    @PostMapping()
    public ProductResponseDto SaveProduct(@RequestBody ProductRequestDto productRequestDto) {
        return _productService.addProduct(productRequestDto);
    }

    @GetMapping()
    public List<ProductResponseDto> GetAllProducts() {
        return _productService.getAllProducts();
    }

    @GetMapping("{productId}")
    public ProductResponseDto GetProduct(@PathVariable UUID productId) {
        return _productService.getProductById(productId);
    }

    @DeleteMapping("{productId}")
    public void DeleteProduct(@PathVariable UUID productId) {
         _productService.deleteProduct(productId);
    }


}
