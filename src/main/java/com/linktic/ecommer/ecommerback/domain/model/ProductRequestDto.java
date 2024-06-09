package com.linktic.ecommer.ecommerback.domain.model;


import java.math.BigDecimal;
import java.util.UUID;


public record ProductRequestDto(

        String Name,
        String Description,
        BigDecimal Price,
        Integer Quantity,
        String Code,
        String ImageUrl,
        UUID UserId,
        UUID CategoryId

) {
}
