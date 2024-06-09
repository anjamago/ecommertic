package com.linktic.ecommer.ecommerback.infrastructure.Adapter;

import com.linktic.ecommer.ecommerback.domain.port.IUserRepository;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserCrudRepository implements IUserRepository {

    private  final IUserCrudRepository _userCrudRepository;


    public UserCrudRepository(IUserCrudRepository userCrudRepository) {
        _userCrudRepository = userCrudRepository;
    }

    @Override
    public UserEntity Save(UserEntity user) {

        var entity = _userCrudRepository.save(user);
        return entity;
    }

    @Override
    public UserEntity FindByEmail(String email) {
        return null;
    }

    @Override
    public UserEntity FindById(UUID userid) {
        var entity = _userCrudRepository.findById(userid).get();
        return entity;
    }
}
