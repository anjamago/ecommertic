package com.linktic.ecommer.ecommerback.infrastructure.Api;


import com.linktic.ecommer.ecommerback.application.UserService;
import com.linktic.ecommer.ecommerback.domain.model.User;
import com.linktic.ecommer.ecommerback.domain.model.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService _userService;


    public UserController(UserService userService) {
        _userService = userService;
    }

    @PostMapping()
    public UserDto Save(@RequestBody UserDto user){
        return _userService.Save(user);
    }

    @GetMapping()
    public User Get(@RequestParam UUID userId){
        return _userService.findById(userId);
    }

}
