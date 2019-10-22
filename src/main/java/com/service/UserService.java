package com.service;

import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.dto.UserDTO;
import com.model.User;

@Service
	public class UserService extends AbstractService<User,UserDTO>{
		
		public UserDTO findByUsernameAndPassword(String username, String password) {
			return converter.toDto(((UserRepository)repository).findByUsernameAndPassword(username, password));
		}
	}

