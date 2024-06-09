package com.linktic.ecommer.ecommerback.domain.model;

import java.util.UUID;

public record CategoryReponseDto (
        UUID categoryId,
        String Name
) {
}
