package com.finalproject.webapi.mapper;

import com.finalproject.webapi.dto.UserDTO;
import com.finalproject.webapi.entities.UsersEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

//    private RoleService roleService;
//    private StatusService statusService;

    public UserDTO toDTO(UsersEntity usersEntity){
        UserDTO userDTO = new UserDTO(usersEntity.getId(), usersEntity.getName(), usersEntity.getEmail(), usersEntity.getAccount(), usersEntity.getPassword(), usersEntity.getAddress(), usersEntity.getPhone(), usersEntity.getRolesEntity().getId(),usersEntity.getStatusEntity().getId());
        return userDTO;
    }

//    public UsersEntity toEntity(UserDTO userDTO){
//        UsersEntity usersEntity = new UsersEntity(userDTO.getId(), userDTO.getName(), userDTO.getEmail(), userDTO.getAccount(), userDTO.getPassword(), userDTO.getAddress(), userDTO.getPhone(), )
//    }
}
