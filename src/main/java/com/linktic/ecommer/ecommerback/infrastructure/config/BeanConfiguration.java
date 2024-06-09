package com.linktic.ecommer.ecommerback.infrastructure.config;

import com.linktic.ecommer.ecommerback.application.CategoryService;
import com.linktic.ecommer.ecommerback.application.ProductService;
import com.linktic.ecommer.ecommerback.application.UserService;
import com.linktic.ecommer.ecommerback.domain.port.ICategoryRepository;
import com.linktic.ecommer.ecommerback.domain.port.IProductRepository;
import com.linktic.ecommer.ecommerback.domain.port.IUserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository userRepository) {
        return new UserService(userRepository);
    }

    @Bean
    public ProductService productService(IProductRepository productRepository) {
        return  new ProductService(productRepository);
    }

    @Bean
    public CategoryService categoryService( ICategoryRepository categoryRepository) {
        return  new CategoryService(categoryRepository);
    }
}
