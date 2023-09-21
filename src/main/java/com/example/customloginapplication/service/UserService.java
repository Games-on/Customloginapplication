package com.example.customloginapplication.service;

import com.example.customloginapplication.dto.UserDto;
import com.example.customloginapplication.Model.User;

public interface UserService {

    User findByUsername(String username);
    User save (UserDto userDto);

}
