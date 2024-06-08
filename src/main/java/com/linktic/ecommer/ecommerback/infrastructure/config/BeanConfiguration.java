package com.linktic.ecommer.ecommerback.infrastructure.config;

import com.linktic.ecommer.ecommerback.application.UserService;
import com.linktic.ecommer.ecommerback.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository userRepository) {
        return new UserService(userRepository);
    }
}
