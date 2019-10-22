package com.converter;

import org.springframework.stereotype.Component;

import com.dto.UserDTO;
import com.model.User;

@Component
public class UserConverter extends AbstractConverter<User,UserDTO> {
public User toEntity (UserDTO userDTO) {
	User user = null;
	if(userDTO != null) {
		user = new User(userDTO.getId(),userDTO.getUsername(),userDTO.getPassword(),userDTO.getUserType());
		}
	return user;
    }

public UserDTO toDto (User user) {
	UserDTO userDTO = null;
	if(user != null) {
		userDTO = new UserDTO(user.getId(),user.getUsername(),user.getPassword(),user.getUserType());
		}
return userDTO;
     }

}