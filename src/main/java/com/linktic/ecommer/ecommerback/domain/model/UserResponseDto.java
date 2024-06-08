package com.linktic.ecommer.ecommerback.domain.model;

import java.util.UUID;

public record UserResponseDto(
        UUID userId,
        String UserName,
        String FirstName,
        String LastName,
        String Email,
        String Address,
        Long CellphoneNumber,
        UserType UserType
) {

}
