package com.linktic.ecommer.ecommerback.infrastructure.Api;


import com.linktic.ecommer.ecommerback.application.CategoryService;
import com.linktic.ecommer.ecommerback.domain.model.CategoryReponseDto;
import com.linktic.ecommer.ecommerback.domain.model.CategoryRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private  final CategoryService _categoryService;

    public CategoryController(CategoryService categoryService) {
        _categoryService = categoryService;
    }

    @PostMapping()
    public CategoryReponseDto addCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
        return  _categoryService.createCategory(categoryRequestDto);
    }

    @GetMapping()
    public List<CategoryReponseDto> getCategories() {
        return _categoryService.getAllCategories();
    }
    @GetMapping("{categoryId}")
    public CategoryReponseDto getCategory(@PathVariable UUID categoryId) {
        return _categoryService.getFiindCategory(categoryId);
    }

    @DeleteMapping("{categoryId}")
    public void deleteCategory(@PathVariable UUID categoryId) {
        _categoryService.deleteCategory(categoryId);
    }

}
