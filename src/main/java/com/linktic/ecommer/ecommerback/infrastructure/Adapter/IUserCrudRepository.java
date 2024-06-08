
package com.linktic.ecommer.ecommerback.infrastructure.Adapter;

import com.linktic.ecommer.ecommerback.infrastructure.Entitys.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IUserCrudRepository  extends CrudRepository<UserEntity, UUID> {

}
