
package com.linktic.ecommer.ecommerback.domain.port;

import com.linktic.ecommer.ecommerback.infrastructure.Entitys.UserEntity;

import java.util.UUID;

public interface IUserRepository {
    UserEntity Save(UserEntity user);
    UserEntity FindByEmail(String email);
    UserEntity FindById(UUID userid);

}
