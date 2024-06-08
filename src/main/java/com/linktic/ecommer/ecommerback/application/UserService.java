package com.linktic.ecommer.ecommerback.application;

import com.linktic.ecommer.ecommerback.domain.model.User;
import com.linktic.ecommer.ecommerback.domain.model.UserDto;
import com.linktic.ecommer.ecommerback.domain.model.UserResponseDto;
import com.linktic.ecommer.ecommerback.domain.port.IUserRepository;
import com.linktic.ecommer.ecommerback.infrastructure.Entitys.UserEntity;

import java.util.UUID;

public class UserService {
    private  final IUserRepository _userRepository;

    public UserService(IUserRepository userRepository) {
        _userRepository = userRepository;

    }

    public UserDto Save(UserDto user){
        UserEntity entity= new UserEntity(
                user.UserName(),
                user.FirstName(),
                user.FirstName(),
                user.Email(),
                user.Password(),
                user.Address(),
                user.CellphoneNumber(),
                user.UserType()
        );

        _userRepository.Save(entity);

        return user;
    }

    public UserResponseDto findById(UUID userId){
        var data =   _userRepository.FindById(userId);

        return new UserResponseDto(
                data.getIdUser(),
                data.getUserName(),
                data.getFirstName(),
                data.getLastName(),
                data.getEmail(),
                data.getAddress(),
                data.getCellphoneNumber(),
                data.getUserType()
        );
    }
}
