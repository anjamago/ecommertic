package com.linktic.ecommer.ecommerback.domain.model;

public record  UserDto(
        String UserName,
        String FirstName,
        String LastName,
        String Email,
        String Password,
        String Address,
        Long CellphoneNumber,
        UserType UserType
){}