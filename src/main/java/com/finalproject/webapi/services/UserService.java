package com.finalproject.webapi.services;

import com.finalproject.webapi.dto.UserDTO;
import com.finalproject.webapi.entities.UsersEntity;
import com.finalproject.webapi.mapper.UserMapper;
import com.finalproject.webapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserDTO> getAllUsers() {
        List<UsersEntity> listUserEntity = userRepository.findAll();
        List<UserDTO> listUserDTO = new ArrayList<>();
        for(UsersEntity user : listUserEntity){
            listUserDTO.add(userMapper.toDTO(user));
        }
        return listUserDTO;
    }

}
